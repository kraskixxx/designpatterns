package com.workshops.javasamples.grokkingjavainterview;

public class TaskExtendedFromThreadTest {

    public static void main(String[] args) {
        for(int i = 0; i<=5; i++) {
            TaskExtendedFromThread task = new TaskExtendedFromThread();
            task.setName("Thread " + i);
            task.start();

        }
    }
}
