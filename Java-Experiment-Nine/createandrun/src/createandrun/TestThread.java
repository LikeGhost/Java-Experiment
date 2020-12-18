package createandrun;

public class TestThread {
    public  static void main(String[]args){
        int cnt=0;
        Thread[] t=new Thread[6];
        for(int i=0;i<3;i++){
            t[cnt]=new Thread(new ReceiveMailRunnable());
            t[cnt].start();
            cnt++;
        }
        for(int i=0;i<3;i++){
            t[cnt]=new Thread(new SendMailRunnable());
            t[cnt].start();
            cnt++;
        }

        for(Thread thread:t){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("foxmail任务结束");
    }

}
