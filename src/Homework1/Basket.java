package Homework1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Basket {

    private List<String> fruits;

    public Basket() {
        this.fruits = new ArrayList<>();
    }

    public boolean find(String searchedFruit){
        return fruits.contains(searchedFruit);

    }

    public boolean remove(String fruitToBeRemoved){
        return  fruits.remove(fruitToBeRemoved);
    }

    public Collection<String> distinct(){
        return Set.copyOf(fruits);
    }

    public void add(String fruitToBeAdded){
        if(fruitToBeAdded != null) {
            fruits.add(fruitToBeAdded);
        }
    }

    public String fruitNumber(int numberOfFruit){
      return fruits.get(numberOfFruit);

    }

    public int customFruitNumber(){
        int customNumber = 0;
        for(String fruitToBeAdded : fruits){
            customNumber++;
        }
        return customNumber;
    }

}
