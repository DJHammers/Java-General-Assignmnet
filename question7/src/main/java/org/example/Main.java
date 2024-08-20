package org.example;

public class Main {
    public static void main(String[] args) {
        Item i  = new Item(1, "gift");

        System.out.println("Item Location " + i.getLocation());
        System.out.println("Item Description " + i.getDescription());

        i.setLocation(2);
        i.setDescription("gift2");

        System.out.println("Item Location " + i.getLocation());
        System.out.println("Item Description " + i.getDescription());

        Monster m = new Monster(3, "gift3");

        System.out.println("Monster Location " + m.getLocation());
        System.out.println("Monster Description " + m.getDescription());

        m.setLocation(4);
        m.setDescription("gift4");

        System.out.println("Monster Location " + m.getLocation());
        System.out.println("Monster Description " + m.getDescription());

    }
}