import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new LinkedList<>();

        System.out.println(firstList);

        firstList.add("one");

        System.out.println(firstList);
        firstList.add("two");

        System.out.println(firstList);
        firstList.add(1,"one and a half");

        System.out.println(firstList);

        System.out.println(firstList.get(2));

        for(int i  = 0; i < 1000; i++){
            firstList.add(String.valueOf(i));
        }
        System.out.println(firstList);
        System.out.println(firstList.size());


    }
}
