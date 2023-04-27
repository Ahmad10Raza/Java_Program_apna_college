import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Java program to convert Decimal number into Binary in Java.
 *
 * @author Javin
 */
public class Dec_To_Bin_Recursion
 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.MAX_VALUE;

        while (number != 0) {
            // Ask user to enter number for decimal to binary conversion
            System.out.println("\nEnter a decimal number to convert into binary format");

            number = sc.nextInt();

            // one way to convert decimal number to binary in Java
            byte[] bits = toBinary(number);
            printBinary(bits);

            // combined conversion and printing part in one method
            convert(number);

        }
        sc.close();

    }

    /*
     * Java Method to convert decimal to binary
     */
    public static byte[] toBinary(int number) {
        byte[] binary = new byte[32];
        int index = 0;
        int copyOfInput = number;
        while (copyOfInput > 0) {
            binary[index++] = (byte) (copyOfInput % 2);
            copyOfInput = copyOfInput / 2;
        }

        return binary;
    }

    /*
     * Print number in binary format
     */
    public static void printBinary(byte[] binary) {
        for (int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    /*
     * Combination of previous two method to convert and print binary numbers
     */
    public static void convert(int input) {
        int copyOfInput = input;
        StringBuilder sb = new StringBuilder();

        while (copyOfInput > 0) {
            byte bit = (byte) (copyOfInput % 2);
            sb.append(bit);
            copyOfInput = copyOfInput / 2;
        }

        System.out.printf("\nDecimal number %d in Binary format is %s %n", input, sb.toString());
    }

}
