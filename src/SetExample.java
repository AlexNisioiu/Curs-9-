import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        mySet.add(3);
        mySet.add(2);
        mySet.add(3);


        System.out.println(mySet);

        for(Integer i : mySet){
            System.out.println(i);
        }

        SortedSet<Integer> myOrderedSet = new TreeSet<>();
        myOrderedSet.add(3);
        myOrderedSet.add(1);
        myOrderedSet.add(2);

        System.out.println(myOrderedSet);



    }
}
