package matrix;

public class Matrix {
    private int rows,cols;
    private double[][] data;

    Matrix (int rows,int cols){
        this.rows=rows;
        this.cols=cols;
        this.data=new double[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                this.data[i][j]=0;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setElement(int row, int col, double value){
        this.data[row][col]=value;
    }
    public Matrix add(Matrix m){
        if(this.rows==m.rows&&this.cols==m.cols){
            Matrix ret=new Matrix(this.rows,this.cols);
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    ret.data[i][j]=this.data[i][j]+m.data[i][j];

                }
            }
            return ret;
        }
        return null;
    }
    public Matrix minus(Matrix m){
        if(this.rows==m.rows&&this.cols==m.cols){
            Matrix ret=new Matrix(this.rows,this.cols);
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    ret.data[i][j]=this.data[i][j]-m.data[i][j];
                }
            }
            return ret;
        }
        return null;
    }
    public Matrix multiple(Matrix m){
        if(this.cols==m.rows){
            Matrix ret=new Matrix(this.rows,m.cols);
            for(int i=0;i<this.rows;i++){
                for(int j=0;j<m.cols;j++) {
                    for(int k=0;k<this.cols;k++){
                        ret.data[i][j]=ret.data[i][j]+this.data[i][k]*m.data[k][j];
                    }
                }
            }
            return ret;
        }
        return null;
    }
    public Matrix transposition(){
        Matrix ret=new Matrix(this.cols,this.rows);
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
                ret.data[j][i]=this.data[i][j];
            }
        }
        return ret;
    }
    public void display(){
        for(double[]i:this.data){
            for(double j:i){
                System.out.printf("%10.2f",j);
            }
            System.out.print("\n");
        }
        System.out.println();
    }

}
