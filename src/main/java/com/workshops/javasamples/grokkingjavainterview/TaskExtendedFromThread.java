package com.workshops.javasamples.grokkingjavainterview;

class TaskExtendedFromThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}