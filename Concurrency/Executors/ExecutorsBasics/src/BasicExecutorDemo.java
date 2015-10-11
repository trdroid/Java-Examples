import java.util.concurrent.Executor;

public class BasicExecutorDemo {
    public static void main(String[] args) {
        CustomExecutor customExecutor = new CustomExecutor(4);

        customExecutor.execute(new Job());
    }
}

class CustomExecutor implements Executor {
    private int times;

    public CustomExecutor(int times) {
        this.times = times;
    }

    /*
        Abstracts how the thread is created/executed
        The creation of a job and its execution are decoupled
    */
    public void execute(Runnable runnable) {
        for(int iter = 0; iter < times; iter++) {
            new Thread(runnable, "Thread " + iter).start();
        }
    }
}

class Job implements Runnable {
    public void run() {
        System.out.println("Performing a job in " + Thread.currentThread().getName());
    }
}