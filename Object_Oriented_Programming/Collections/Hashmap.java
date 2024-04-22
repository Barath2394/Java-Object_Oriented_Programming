package Java-Object_Oriented_Programming.Object_Oriented_Programming.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map<String , Integer> number = new HashMap<>();
        number.put("One",1);
        number.put("Two",2);
        number.put("Three",3);
        number.put("Four",4);
        System.out.println(number);
//        Check if the key exists or not
        if(number.containsKey("Four")){
            System.out.println("Exists");
        }
        else
            System.out.println("Not exists");

//        Get value by key
        Integer v1 = number.get("One");
        System.out.println(v1);

//        How to remove the key from hashmap
        number.remove("One");
        System.out.println(number);

//        Only get the keys
        Set<String> key = number.keySet();
        System.out.println(key);

    }
}
