package FileManager;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FMFrame extends JFrame {
    private static int directoryNum=-1;
    private static int fileNum=0;
    public static void countFileNum(File file){
       if(file.isDirectory()){
           directoryNum++;
          File[]files=file.listFiles();
          for(File f:files){
              if(f.isDirectory()) {
                  countFileNum(f);
              }
              else fileNum++;
          }

       }

    }
    public FMFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel();
        jPanel.add(new JLabel("打开文件："));
        JButton jButton=new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser=new JFileChooser("C:\\Users\\11540\\desktop");
                jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                JOptionPane jOptionPane=new JOptionPane();
                if(jFileChooser.showOpenDialog(null)==jFileChooser.APPROVE_OPTION) {
                    File file = jFileChooser.getSelectedFile();
                    countFileNum(file);
                    JOptionPane.showMessageDialog(jFileChooser,"文件夹数："+directoryNum+"文件数："+fileNum);
                    directoryNum=-1;
                    fileNum=0;
                }
                else{
                    JOptionPane.showMessageDialog(jFileChooser,"未选择文件");
                }
            }
        });
        jButton.setText("选择文件");
        jPanel.add(jButton);
        add(jPanel);
        pack();
    }
}
