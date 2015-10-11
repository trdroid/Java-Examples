import java.util.concurrent.Executor;

public class BasicExecutorDemo {
    public static void main(String[] args) {
        CustomExecutor customExecutor = new CustomExecutor(4);

        /*
            Job Creation ONLY.
            Job execution is NOT handled here.
         */
        Job job = new Job("TaskA");

        customExecutor.execute(job);
    }
}

class CustomExecutor implements Executor {
    private int times;

    public CustomExecutor(int times) {
        this.times = times;
    }

    /*
        Job execution is handled here
        The creation of a job and its execution are decoupled

        In general, the execute() method abstracts how threads are created and/or executed
    */
    public void execute(Runnable runnable) {
        for(int iter = 0; iter < times; iter++) {
            new Thread(runnable, "Thread " + iter).start();
        }
    }
}

class Job implements Runnable {
    private String name;

    public Job(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Performing job " + name + " in " + Thread.currentThread().getName());
    }
}
