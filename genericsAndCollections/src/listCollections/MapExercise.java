package listCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String,Integer> mapObj = new HashMap<>();
        mapObj.put("Deva", 80000);
        mapObj.put("Calan",15000);
        mapObj.put("Sibiu",150000);


        System.out.println(mapObj);
    }
}
