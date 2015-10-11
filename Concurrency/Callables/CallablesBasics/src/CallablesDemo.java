import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallablesDemo {
    public static void main(String[] args) {
        /*
            Instantiate a callable task that should be executed by a thread from a thread pool
         */
        Callable<Integer> summationTask = new Summation(10);

        /*
            Create a thread pool with single thread using a utility class of Executor, ExecutorService
            which abstracts details such as how the task is assigned to threads and when the task is executed.
         */
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        /*
            Use the submit() method to submit the task
            The submit() method of the ExecutorService returns a Future instance

            Calling the blocking method get() on the Future instance returns the result after task completion
         */
        Future<Integer> future = executorService.submit(summationTask);

        try {

            /*
                if the result is not ready yet, the get() method blocks until the result is available
             */
            System.out.println("Total is " + future.get());
        }catch(Exception e) {}

        executorService.shutdown();
    }
}

class Summation implements Callable<Integer> {
    private Integer n;
    public Summation(Integer n) {
        this.n = n;
    }

    /*
        Define the task that should be executed on a thread from a thread pool
     */
    public Integer call() throws Exception {
        System.out.println("Executing in thread " + Thread.currentThread().getName());
        if(n < 0) {
            throw new Exception("N should be a positive number");
        }

        int result = 0;

        for(int index = 1; index <= n; index++) {
            result += index;
        }

        return result;
    }
}