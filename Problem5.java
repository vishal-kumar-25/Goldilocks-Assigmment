// 5. Write a program to store the value in Hashmap (key, store) and then search those given value
// from the hashmap and print it.
// a. Name is key and age is value so store some sample values like
// i. (Ram, 36), (shyam,60)

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ram", 36);
        map.put("Shyam", 60);

        String searchKey = "Ram";

        if (map.containsKey(searchKey)) {
            System.out.println("Age: " + map.get(searchKey));
        } else {
            System.out.println("Not Found");
        }
    }
}