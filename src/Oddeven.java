import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int total = 0;

        System.out.print("Enter a number");
        int gradeCounter = 1;

        int odd = number;
        int even = number;

        if (number % 2 == 0) {
            System.out.print("The number entered is even number");
        }
        else {
            System.out.println("the number enter is odd");
        }
    }




}
