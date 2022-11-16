import java.util.Scanner;

public class Json {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: z");
        int age = scanner.nextInt();

        if ( age < 20) System.out.println("you be pikin, getat!!;");
        if (age >= 20 && age < 29) System.out.println("na God save you");
        if (age >= 29 && age<40) System.out.println("you be agba");
        if (age >= 40) System.out.println("na God save you");

    }
}
