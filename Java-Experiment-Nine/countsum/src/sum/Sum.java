package sum;

public class Sum {
    private long sum;
    public synchronized void add(int x){
        this.sum+=x;
    }

    public long getSum() {
        return sum;
    }
}
