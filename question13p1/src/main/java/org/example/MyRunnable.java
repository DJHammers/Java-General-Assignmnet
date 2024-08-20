package org.example;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        try{
            for (int i=1; i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" is running iteration "+i);
            Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        Thread thread1 = new Thread(myRunnable1, "Thread 1");
        Thread thread2 = new Thread(myRunnable2, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
