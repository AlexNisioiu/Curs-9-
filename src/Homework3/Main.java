package Homework3;

public class Main {
    public static void main(String[] args) {

        Company c = new Company();

        c.addEmployee(new Person("Alex", 50, "Welder"));
        c.addEmployee(new Person("Andrei", 19, "Manager"));
        c.addEmployee(new Person("Matei", 25, "Welder"));
        c.addEmployee(new Person("George",35,"Carpenter"));
        c.addEmployee(new Person("Cosmin",30,"Plummer"));
        c.addEmployee(new Person("Cosmin",45,"Welder"));
        c.addEmployee(new Person("Vlad",65,"Plummer"));


        Person manager = c.getManager();

        System.out.println(manager);

        System.out.println(c.getPersons("Plummer"));
        System.out.println(c.getPersonsOlder(50));

        System.out.println(c.getPerson("Cosmin"));


    }
}


