import java.io.*;

public class ReadCSV {

    public static void main(String[] args) {
        String inputFile = "input.csv";
        String outputFile = "output.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int sum = 0;

                for (String val : values) {
                    sum += Integer.parseInt(val.trim());
                }

                bw.write(line + "," + sum);
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}