package deadlock;


public class Chopsticks {
    private boolean []chopsticks;
    public Chopsticks(){
        chopsticks=new boolean[5];

    }
    public synchronized void takeChopsticks(int i){
        while(chopsticks[i]||chopsticks[(i+1)%5]){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chopsticks[i]=true;
        chopsticks[(i+1)%5]=true;
    }
    public synchronized void putChopsticks(int i){
        chopsticks[i]=false;
        chopsticks[(i+1)%5]=false;
        notifyAll();
    }
}
