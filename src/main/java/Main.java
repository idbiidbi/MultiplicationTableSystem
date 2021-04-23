import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = Integer.parseInt(input.nextLine());

        System.out.print("Enter how many times: ");
        int howManyTimes = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= howManyTimes ; i++) {
            int result = number * i;
            System.out.println( number + " * " + i + " = " + result);
        }
    }
}
