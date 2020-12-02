package CalculateE;

public class CalculateE {
    public static void main(String []args){
        double sum=0,fact=1,x=1e-6;
        for(int i=1;1.0/fact>=1e-6;i++){
            sum=sum+1.0/fact;
            fact=fact*i;
        }
        System.out.println(sum);
    }
}
