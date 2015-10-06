import java.util.concurrent.CountDownLatch;

/**
 * Threads synchronize on a CountDownLatch
 * The MainThread passes its CountDownLatch instance to other threads so that they can call await on this instance
 * to synchronize.
 *
 * Two independent threads wait for the main thread to finish performing its operations before executing
 *
 * Once the countdown is 0, these two threads are released for execution
 */
public class MainThread {
    private final static int TOTAL_NUMBER_OF_OPERATIONS = 10;

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(TOTAL_NUMBER_OF_OPERATIONS);
        
        new Thread(new JobA(countDownLatch)).start();
        new Thread(new JobB(countDownLatch)).start();

        long operationsLeft = countDownLatch.getCount();

        while(operationsLeft > 0) {
            System.out.println("Operations Left:" + operationsLeft);
            performOperation();

            //Reduce the count once an operation completes
            countDownLatch.countDown();
            operationsLeft = countDownLatch.getCount();
        }
    }

    private static void performOperation() {
        try {
            Thread.sleep(2000);
        }catch(Exception e) {}
    }
}

class JobA implements Runnable {
    private CountDownLatch countDownLatch;

    public JobA(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        try {
            System.out.println("JobA waiting ...");

            //wait until the count associated with the countDownLatch becomes zero
            countDownLatch.await();
            System.out.println("JobA Started");
            Thread.sleep(5000);
            System.out.println("JobA Done");
        }catch(InterruptedException e) {}
    }
}

class JobB implements Runnable {
    private CountDownLatch countDownLatch;

    public JobB(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        try {
            System.out.println("JobB waiting ...");

            //wait until the count associated with the countDownLatch becomes zero
            countDownLatch.await();
            System.out.println("JobB Started");
            Thread.sleep(5000);
            System.out.println("JobB Done");
        }catch(InterruptedException e) {}
    }
}