import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = scanner.nextInt();
        int numberofLoopExecution=0;
        StringBuffer buffer = new StringBuffer();
        for(int counter= counter-1;counter>=1;counter--){
            number = number * counter;
            System.out.println("number "+counter);
            System.out.println("number"+number);
         System.out.println("number+ *" +counter);
         buffer.append(counter+1);
         buffer.append("*");
number=number*counter;
System.out.println(number);
numberofLoopExecution++;
                }
                buffer.append(1);
                System.out.println(buffer);
                System.out.println("factorial is "+number);
                System.out.println("loop executed"+ numberofLoopExecution+"times");



            }

    }

