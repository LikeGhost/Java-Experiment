package createandrun;

public class SendMailRunnable implements Runnable{
    @Override
    public void run() {
        int n=(int)(10+Math.random()*(20-10+1));
        for(;n>0;n--){
            System.out.println("I am sending emails");
            try {
                Thread.sleep((int)(1000+Math.random()*(2000-1000+1)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("当前线程"+Thread.currentThread().getName()+"正要退出");
    }
}
