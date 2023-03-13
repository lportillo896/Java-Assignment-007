/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class MyMath {

    public static void gcf() {
        Scanner input = new Scanner(System.in);  //Initializes the scanner class and variables
        int a;
        int b;
        int c = 0;

        System.out.println("Welcome to Euclid's Greatest Common Factor Algorithm");

        System.out.println("Type your first number: ");  //Accepts user input for first number
        a = input.nextInt();

        System.out.println("Type your second number: ");  //Accepts user input for second number
        b = input.nextInt();

        System.out.printf("The GCF of %d and %d is ",a,b); //Prints to output the numbers entered

        while(b != 0) {  //Implementation of Euclid's algorithm
            if (a > b) {
                c = b;
                b = a % b;
                a = c;
            }
            else {
                b = b % a;
            }
        }
        System.out.printf("%d.",c);  //Prints to output the GCF
    }

    public static void main(String[] args) {  //Main method
        gcf();
    }
}
