// 7. Write a program that take the command line input and print all received inputs


public class CommandLineInput {

    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}