package Ex2;

import java.time.LocalDate;

public class Programmer extends Employee {
    private final String language;

    public Programmer(LocalDate birthday) {
        super(birthday);
        this.language = "Default";
    }

    public Programmer(LocalDate birthday, String language) {
        super(birthday);
        this.language = language;
    }

//    public void changeLanguage(){
//        this.language = "Altceva"; eroare de compilare
//    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return "Programmer";
    }

    @Override
    public String getFullName() {
        return getFirstName() + getLastName();
    }


}
