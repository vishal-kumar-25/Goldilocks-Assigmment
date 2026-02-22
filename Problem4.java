// 4. Write a program to call a HTTP URL and print the output
// a. URL is http://127.0.0.1:8999/test?value=p

import java.net.*;
import java.io.*;

public class HttpCall {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://127.0.0.1:8999/test?value=p");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

