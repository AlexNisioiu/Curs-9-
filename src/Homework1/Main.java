package Homework1;

public class Main {

    public static void main(String[] args) {
        Basket b = new Basket();
        b.add("Banana");
        b.add(null);
        System.out.println(b.distinct());

        b.add("Mar");
        System.out.println(b.distinct());

        b.add("Portocala");
        System.out.println(b.distinct());

        b.add("Pruna");
        System.out.println(b.distinct());

        b.add("Capsuna");
        System.out.println(b.distinct());

        b.add("Para");
        System.out.println(b.distinct());

        System.out.println(b.find("Portocala"));
        System.out.println(b.find("Mandarina"));

        System.out.println(b.fruitNumber(3));

        System.out.println(b.customFruitNumber());

        System.out.println(b.remove("Pruna"));
    }
}
