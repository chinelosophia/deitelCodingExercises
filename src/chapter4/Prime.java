package chapter4;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int prime = number;
        int odd = number;

        System.out.print("Enter a number");

        if(number % 2 == 0) {
            System.out.println("Entered number is Even");
        }

        else{
      System.out.println("Entered number is odd");
        }

    }
}

