public class DecimalToBinary {

    public static String convertToBinary(String decimalStr) {
        try {
            int number = Integer.parseInt(decimalStr);
            if (number < 0) {
                throw new IllegalArgumentException("Negative numbers not allowed");
            }
            return Integer.toBinaryString(number);
        } catch (NumberFormatException e) {
            return "Invalid decimal input";
        }
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary("123"));
    }
}