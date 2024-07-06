package Ex2;

import java.time.LocalDate;


public  class Employee implements Person{
    private String firstName;
    private  String lastName;
    private LocalDate birthday;
    private String adrees;

    private LocalDate dateOfEmployment;
    private String position;


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String getAdrees() {
        return adrees;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public Employee(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public  String getFullName(){
        return firstName + " " + lastName;
    }

}
