import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> dictionar = new HashMap<>();
        dictionar.put("Mar","Un fruct in forma de mar");
        dictionar.put("Mar","am facut update la definitia marului");
        dictionar.put("Struguri", "Un fruct ce creste in ciorchine");


        System.out.println(dictionar);

    }
}
