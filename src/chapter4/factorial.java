package chapter4;

public class factorial {
    public static void main(String[] args) {
        int number = 1024;
        System.out.print("factors of " + number + " are: ");
        for (int input = 2; input <= number; ++input) {
            if (number % input == 0) {
                System.out.print( input + " ");
            }

        }

    }
}