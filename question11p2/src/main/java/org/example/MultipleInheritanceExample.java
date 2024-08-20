package org.example;

public class MultipleInheritanceExample implements X,Y {
    @Override
    public void methx(){
        System.out.println("Method x implementation");
    }

    @Override
    public void methy(){
        System.out.println("Method y implementation");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.methx();
        obj.methy();
    }
}
