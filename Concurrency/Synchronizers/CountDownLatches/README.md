# CountDownLatches

CountDownLatch is a synchronizer that the threads can use to wait until certain conditions are met.

For example, these conditions could be the completion of a set of operations or the occurrence of a set of events.

A countdown indicates whether the prerequisite conditions are met or not. A value of x > 0 for a countdown implies 
about x pending tasks/events. The waiting threads are released when the value of the countdown reaches 0. 