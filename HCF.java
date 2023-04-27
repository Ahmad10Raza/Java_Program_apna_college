import java.util.*;
public class HCF {

    public static void main(String args[]){

        //Enter two number whose GCD needs to be calculated.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number to find GCD: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter second number to find GCD: ");
        int number2 = scanner.nextInt();

        System.out.print("HCF of two numbers " + number1 +" and "+ number2 +" is :" + findGCD(number1,number2));

      scanner.close();
    }

    /*
     * Java method to find GCD of two number using Euclid's method
     * @return GDC of two numbers in Java
     */
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

}
