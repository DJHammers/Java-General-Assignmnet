package org.example;

public class MyClass implements A{
    
    @Override
    public void meth1(){
        System.out.println("Method 1 implementation.");
    }

    @Override
    public void meth2(){
        System.out.println("Method 2 implementation.");
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
    }
    
}
