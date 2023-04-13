package JavaAssessment;

import java.util.Scanner;

public class ReversingDigit {

        public static void main(String[] args) {
            reverseDigit();
        }


        public static void reverseDigit() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a digit you want to reverse: ");
            int input = scanner.nextInt();
            int revDigit = 0; //container to hold reverse input
            while (input > 0) {
                revDigit = (revDigit * 10) + input % 10; //add subsequent remainder to revDigit
                input /= 10; // this reduces the value of input
            }
            System.out.printf("Reverse Digit is: %d",revDigit);
        }


    }







