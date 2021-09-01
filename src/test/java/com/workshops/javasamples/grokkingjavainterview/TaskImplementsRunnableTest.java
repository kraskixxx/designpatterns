package com.workshops.javasamples.grokkingjavainterview;

public class TaskImplementsRunnableTest {

    public static void main(String[] args) {
        for(int i = 0;i<=5;i++) {
            Thread thread = new Thread(new TaskImplementsRunnable());
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}
