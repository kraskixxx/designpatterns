package com.workshops.javasamples.grokkingjavainterview;

public class TaskImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
