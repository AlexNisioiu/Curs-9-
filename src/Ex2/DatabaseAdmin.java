package Ex2;

import java.time.LocalDate;


public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(LocalDate birthday) {
        super(birthday);

    }

    @Override
    public String getAdrees() {
        return super.getAdrees();
    }

    public String getDbTechnology() {
        return "db admin: " + dbTechnology;
    }


}
