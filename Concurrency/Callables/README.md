# Callables

A Callable represents a task that needs to be executed by a thread from a thread pool. 

The Callable interface declares only one method with the following signature:

```java
V call() throws Exception
```

The implementation of the call() method represents a task.

The task returns a value after it completes. If the task fails to execute, it throws an exception.

### Using Callables

* Define a class that implements Callable<Type>
```java
    class TaskClass implements Callable<Type> {
        Type call() throws Exception {
            //Define a task
        }
    }
```
* Implement a task in the call() method
* Instantiate the class that represents the task
```java
    Callable<Type> taskClassInstance = new TaskClass();    
```
* Create a thread pool, so that the task can run on a thread from the thread pool
* Submit the taskClassInstance to the thread pool, which returns a Future instance from which the result can be fetched

The Thread Pool uses a thread from its pool to run the task of the taskClassInstance by calling 
taskClassInstance.call() where the task is defined. 