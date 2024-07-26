package Homework3;

import java.util.ArrayList;
import java.util.List;

public class Company {

   private  List<Person> employees = new ArrayList<>();

   public void addEmployee(Person person){
      employees.add(person);
   }

   public Person getManager(){
      for(Person p : employees){
         if (p.getPosition().contains("Manager")){
            return p;
         }
      }
      return null;
   }

   public List<Person> getPersons(String profession){
     List<Person> result = new ArrayList<>();
      for(Person p : employees){
         if(profession.equals(p.getPosition())){
            result.add(p);
         }

      }
      return result;
   }
   public List<Person> getPersonsOlder(int age){
      List<Person> result = new ArrayList<>();
      for(Person p : employees){
         if(p.getAge() >= age){
            result.add(p);
         }
      }
      return result;
   }

   public List<Person> getPerson(String filterName){
      List<Person> result = new ArrayList<>();
      for(Person p : employees){
         if(p.getName().contains(filterName)){
            result.add(p);
         }
      }
      return result;
   }


}
