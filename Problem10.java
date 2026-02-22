
// 10. Write a program to find the multiple occurrences of same value in the file. A csv file contain
// column, say col1, col2, col3. You need to find the count of records which has the same value
// of col3.

import java.io.*;
import java.util.*;

public class CountOccurrences {

    public static void main(String[] args) throws Exception {

        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("file.csv"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            String col3 = arr[2];

            map.put(col3, map.getOrDefault(col3, 0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " - " + map.get(key));
            }
        }
    }
}