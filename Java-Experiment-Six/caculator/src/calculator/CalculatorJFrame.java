package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorJFrame extends JFrame{
    JButton display;
    JPanel numJPanel;
    String lastOperator;
    double result;
    boolean start;
    public CalculatorJFrame() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 250);
        this.setLocationRelativeTo(null);

        result=0;
        start=true;
        lastOperator="=";
        display=new JButton();
        display.setEnabled(false);
        display.setPreferredSize(new Dimension(250,50));
        this.add(display,BorderLayout.NORTH);

        numJPanel =new JPanel();
        numJPanel.setLayout(new GridLayout(4,4));
        ActionListener numButton= e -> {

            String now=e.getActionCommand();
            if(start){
                display.setText("");
                start=false;
            }
            display.setText(display.getText()+now);

        };
        ActionListener operatorButton= e -> {
            String now=e.getActionCommand();
            if(start){
                lastOperator=now;
            }
            else{
                calculate(Double.parseDouble(display.getText()));
                lastOperator=now;
                start=true;
            }

        };
        addButton("7",numButton);
        addButton("8",numButton);
        addButton("9",numButton);
        addButton("×",operatorButton);
        addButton("4",numButton);
        addButton("5",numButton);
        addButton("6",numButton);
        addButton("/",operatorButton);
        addButton("1",numButton);
        addButton("2",numButton);
        addButton("3",numButton);
        addButton("+",operatorButton);
        addButton("0",numButton);
        addButton(".",numButton);
        addButton("=",operatorButton);
        addButton("-",operatorButton);
        this.add(numJPanel,BorderLayout.CENTER);
    }
    public void addButton(String text, ActionListener actionListener){
        JButton jButton=new JButton(text);
        jButton.addActionListener(actionListener);
        numJPanel.add(jButton);
    }
    public void calculate(double x){
        switch (lastOperator) {
            case "+":
                result += x;
                break;
            case "-":
                result -= x;
                break;
            case "×":
                result *= x;
                break;
            case "/":
                result /= x;
                break;
            case "=":
                result = x;
                break;
        }
        display.setText(""+result);
    }
}
