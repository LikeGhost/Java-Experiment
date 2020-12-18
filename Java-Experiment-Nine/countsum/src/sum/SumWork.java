package sum;

public class SumWork implements Runnable{
    private int m,n;
    private Sum sum;
    public SumWork(int m,int n,Sum sum){
        this.m=m;
        this.n=n;
        this.sum=sum;
    }
    @Override
    public void run() {
        for(int i=m;i<=n;i++){
            sum.add(i);
        }
    }
}
