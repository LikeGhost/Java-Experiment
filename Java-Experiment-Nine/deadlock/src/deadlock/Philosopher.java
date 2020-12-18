package deadlock;

public class Philosopher implements Runnable{
    private int id;
    private Chopsticks chopsticks;
    public Philosopher(int id,Chopsticks chopsticks){
        this.id=id;
        this.chopsticks=chopsticks;
    }
    @Override
    public void run() {
        while(true){
            thinking();
            chopsticks.takeChopsticks(id);
            eating();
            chopsticks.putChopsticks(id);
        }
    }
    public void eating(){
        long time=(int)(1000+(Math.random()*2000-1000+1));
        System.out.println("哲学家"+id+"将进餐"+time+"ms");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void thinking(){
        long time=(int)(1000+(Math.random()*2000-1000+1));
        System.out.println("哲学家"+id+"将思考"+time+"ms");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
