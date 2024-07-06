package Ex2;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        PersonData p = new PersonData(new Programmer(LocalDate.of(1999,6,12)));
        System.out.println(p.getFullName());

        System.out.println(ChronoUnit.YEARS.between(LocalDate.of(2005,4,20),LocalDate.of(2008,4,26)));





        DatabaseAdmin data = new DatabaseAdmin(LocalDate.of(2007,2,15));
        System.out.println();
    }
}
