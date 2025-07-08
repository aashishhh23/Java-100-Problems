// Write a program that starts a thread and prints its state after each
// significant event(Creation, starting, and termination).
// Use Thread.sleep() to simulate long running tasks and thread.getState() to print the thread state

package com.aashish.challenge100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 =new ThreadState();

        System.out.printf("\nCreated the thread %s",
                t1.getState());
        t1.start();

        t1.join();
        System.out.printf("\nthread finished %s",
        t1.getState());
    }
}
