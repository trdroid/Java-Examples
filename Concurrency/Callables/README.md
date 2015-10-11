# Callables

A Callable represents a task that needs to be executed by a thread from a thread pool. 

The Callable interface declares only one method with the following signature:

```java
V call() throws Exception
```

The implementation of the call() method represents a task.

The task returns a value after it completes. If the task fails to execute, it will throw an exception.

