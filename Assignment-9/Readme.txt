Class: CustomThread
Package: org.example
Extends: Thread
Purpose: Represents a custom thread with specified behaviors defined within the overridden run method. It demonstrates the lifecycle of a thread, including creating, running, sleeping, and exiting.
Properties:
threadName: Holds the name of the thread, set during instantiation.
Constructor:
CustomThread(String name): Initializes a new instance of CustomThread with the specified name and outputs a creation message.
Methods:
getThreadName(): Returns the name of the thread.
run(): Contains the code that executes when the thread starts. It includes a loop to simulate activity, pausing the thread intermittently using Thread.sleep(500). It catches and handles InterruptedException to deal with interruptions during sleep.
Class: ThreadDemo
Package: org.example
Purpose: Demonstrates how to create, start, and coordinate threads using the CustomThread class. It manages the lifecycle of threads and uses the join() method to synchronize thread completions.
Method:
main(String[] args): The entry point of the application. This method:
Instantiates two CustomThread objects named "Thread-1" and "Thread-2".
Starts both threads, initiating their execution.
Uses join() to ensure that the main thread (which runs the main method) waits for both of these threads to complete before continuing.
Handles potential InterruptedException thrown during the join() calls.
Outputs messages to track the status of the threads and main thread activities.
Execution Flow:
Thread Creation: Two instances of CustomThread are created, initializing their names and announcing their creation.
Thread Starting: Both threads are started, which triggers their run methods. This begins their individual operations.
Thread Operation: Each thread counts down from 4 to 1, simulating work by sleeping for 500 milliseconds between each count. Interruptions during sleep are caught and handled appropriately.
Thread Completion: Each thread announces its completion and exits after finishing its countdown.
Main Thread Synchronization: The main thread waits for both threads to complete using the join() method, ensuring that it only continues and exits after both threads have finished their execution.
Class: CustomRunnable
Package: org.example
Implements: Runnable
Purpose: Implements the Runnable interface to define the behavior of threads. This allows for greater flexibility compared to extending the Thread class, as it enables the use of multiple inheritance.
Properties:
threadName: Stores the name of the thread, set during object construction.
Constructor:
CustomRunnable(String name): Initializes the CustomRunnable object with a specified name and prints a creation message.
Methods:
getThreadName(): Returns the name of the thread.
run(): Defines the thread's task, which includes a loop that simulates activity by counting down from 4 to 1, with the thread sleeping for 500 milliseconds between counts. It handles InterruptedException to manage interruptions during sleep. The method concludes by signaling the thread's completion.
Class: ThreadDemo
Package: org.example
Purpose: Demonstrates how to create and manage threads using instances of CustomRunnable. It controls thread execution using the join() method to synchronize thread completions with the main thread.
Method:
main(String[] args): The main execution point of the program. It performs the following operations:
Thread Creation: Instantiates two CustomRunnable objects named "Runnable-1" and "Runnable-2".
Thread Execution: Wraps each Runnable in a Thread and starts them, triggering their run() methods.
Thread Synchronization: Uses join() on each thread to ensure the main thread waits for their completions before proceeding. This guarantees that the main thread only resumes after all threads have finished their tasks.
Error Handling: Catches and reports InterruptedException if the main thread is interrupted while waiting.
Completion Notification: Signals when the main thread is about to terminate, indicating all threads have completed their execution.
Execution Flow:
Initialization: CustomRunnable objects are created, initializing their names and announcing their creation.
Thread Wrapping: Each Runnable is passed to a new Thread object, decoupling the thread's life cycle management from its task definition (Runnable does not manage its own thread life cycle).
Thread Starting: The threads are started, which in turn starts execution of the run() method defined in CustomRunnable.
Simulated Task Execution: Each thread counts down from 4 to 1, pausing between counts. Interruptions during sleep are managed within the run() method.
Completion: Each thread announces its completion after finishing the countdown.
Synchronization: The main thread waits for both child threads to complete using join(), ensuring orderly shutdown and preventing the main thread from terminating prematurely.

