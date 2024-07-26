package Homework2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String>flowers = new HashSet<>();


        flowers.add("Trandafir");
        flowers.add("Lalele");
        flowers.add("Violete");

        System.out.println(flowers.size());

        flowers.add("Camelie");
        System.out.println(flowers.size());

        Iterator itr = flowers.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        flowers.remove("Camelie");

        System.out.println(flowers);



    }


}
