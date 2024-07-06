import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class QueueExample {

    record Person(String name, int priority){

    }

    public static void main(String[] args) {
        PriorityQueue<Person> queue = new PriorityQueue<>(Comparator.comparingInt(Person::priority));
        queue.add(new Person("Alex",1));
        queue.add(new Person("Andrei",1));
        queue.add(new Person("Gigi",0));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Stack<String> stack = new Stack<>();
        stack.add("mere");
        stack.add("pere");
        stack.add("banane");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
