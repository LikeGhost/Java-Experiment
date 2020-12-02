package matrix;

public class Test {
    public static void main(String[]args){
        Matrix MA=new Matrix(4,4),MB=new Matrix(4,4);
        for(int i=0;i<MA.getRows();i++){
            for(int j=0;j<MA.getCols();j++){
                MA.setElement(i,j,1+Math.random()*(100-1+1));
            }
        }
        System.out.println("矩阵A为：");
        MA.display();
        for(int i=0;i<MB.getRows();i++){
            for(int j=0;j<MB.getCols();j++){
                MB.setElement(i,j,1+Math.random()*(100-1+1));
            }
        }
        System.out.println("矩阵B为：");
        MB.display();
        System.out.println("两矩阵相加：");
        MA.add(MB).display();
        System.out.println("两矩阵相减：");
        MA.minus(MB).display();
        System.out.println("两矩阵相乘：");
        MA.multiple(MB).display();
        System.out.println("矩阵A转置：");
        MA.transposition().display();
        System.out.println("矩阵B转置：");
        MB.transposition().display();

    }
}
