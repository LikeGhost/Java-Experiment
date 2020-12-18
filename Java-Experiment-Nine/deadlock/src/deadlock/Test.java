package deadlock;

public class Test {
    public static void main(String[]args){
        Chopsticks chopsticks=new Chopsticks();
        for(int i=0;i<5;i++){
            new Thread(new Philosopher(i,chopsticks)).start();
        }
    }
}
