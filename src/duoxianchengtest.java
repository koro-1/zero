import java.util.concurrent.TimeUnit;

public class duoxianchengtest {
    public static void main(String[] args) {
        MoonRunner runnable=new MoonRunner();
        Thread thread=new Thread(runnable,"moonrunner");
        thread.start();

        try {
            TimeUnit.MICROSECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } thread.interrupt();

    }


    public static class MoonRunner implements  Runnable{

        private  long i=0;
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()){

                i++;
                System.out.println("i="+i);


            }
            System.out.println("stop");

        }
    }
}
