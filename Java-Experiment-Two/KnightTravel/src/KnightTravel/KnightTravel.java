package KnightTravel;

import java.lang.constant.DirectMethodHandleDesc;
import java.util.Scanner;

class step{
    int x,y;
    step(){
        x=0;
        y=0;
    }
}
public class KnightTravel {
    public static int total=0, stepNum =0;
    public static int[][] sign=new int[1000][1000];
    public static boolean flag=true;
    public static int[][] diction= {{2,1},{2,-1},{1,2},{1,-2},{-2,1},{-2,-1},{-1,2},{-1,-2}};

    public static void dfs(int x,int y,int N){
        int n=(int)Math.sqrt(N);
        if(stepNum==N) {
            total++;
            if (flag) {
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n;j++){
                        System.out.printf("%6d",sign[i][j]);
                    }
                    System.out.print('\n');
                }
            }
            flag = false;
            return;
        }
        for(int i=0;i<8;i++){
            int X=x+diction[i][0],Y=y+diction[i][1];
            if(X<=n&&X>=1&&Y>=1&&Y<=n){
                if(sign[X][Y]==0){
                    stepNum++;
                    sign[X][Y]=stepNum;
                    dfs(X,Y,N);
                    stepNum--;
                    sign[X][Y]=0;
                }
            }
        }
    }

    public static void FindKnightWay(int x,int y,int n){
        stepNum++;
        sign[x][y]=stepNum;
        dfs(x,y,n*n);
        sign[x][y]=0;
        stepNum--;

    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt(),y=in.nextInt();
        FindKnightWay(x,y,n);
        System.out.println(total);
    }
}
