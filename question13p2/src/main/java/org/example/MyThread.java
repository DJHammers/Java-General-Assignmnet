package org.example;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        try{
            for(int i = 1; i<=5;i++){
                System.out.println(getName() + " is running iteration" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println(getName()+ "was interrupted");
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Child Thread");
        t1.start();

        try{
            for(int i = 1; i<=5;i++){
                System.out.println("Main Thread is running iteration" + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Main Thread was interrupted");
        }
    }
}
