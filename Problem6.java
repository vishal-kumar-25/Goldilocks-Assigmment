// 6. Write a HTTP server program that take the print the received value read from the DB as per
// Q3


import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;
import java.sql.*;

public class SimpleServer {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8999), 0);

        server.createContext("/test", exchange -> {

            String response = getDataFromDB();

            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.start();
    }

    static String getDataFromDB() {
        return "Sample Response";
    }
}