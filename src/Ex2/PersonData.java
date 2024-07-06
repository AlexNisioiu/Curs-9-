package Ex2;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonData {
    private Person person;

    public PersonData(Person person) {
        this.person = person;
    }

    public String getFullName(){
        return person.getFirstName() + " " + person.getLastName();
    }

    public byte getAge(){

       return (byte)ChronoUnit.YEARS.between(person.getBirthday(), LocalDate.now());
    }
}
