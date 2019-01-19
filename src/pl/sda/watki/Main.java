package pl.sda.watki;

class TwoThread implements Runnable{

    public int dwa(int watki){
        return watki * watki;
    }

    @Override
    public void run(){
        System.out.println(dwa(5));
    }
}

class Runner implements Runnable {

    long silnia(long n) {
        if (n < 2) {
            return 1;
        }
        return silnia(n - 1) * n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Hello: " + i + "thread: " +
                    Thread.currentThread().getName());
            silnia(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ire) {
                ire.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

//        Thread thread = new Thread(new Runner());
//        Thread thread1 = new Thread(new Runner());
//        thread.start();
//        thread1.start();
//        RunnerExample runnerExample = new RunnerExample();
//        runnerExample.start();
//        RunnerExample runnerExample1 = new RunnerExample();
//        runnerExample1.start();
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
//                }
//            }
//        });
//
//        thread.start();
        int[] array = new int[10];
        Thread twoTread = new Thread(new TwoThread());
        twoTread.start();

    }
}
