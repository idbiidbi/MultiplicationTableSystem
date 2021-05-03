import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = Integer.parseInt(input.nextLine());

        System.out.print("Enter how many times: ");
        int howManyTimes = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= howManyTimes; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        System.out.println();

        System.out.println("Multiplication table by 10");
        for (int k = 1; k <= 10; k++) {
            for (int n = 1; n <= 10; n++) {
                System.out.printf("%5d ", k * n);
            }
            System.out.println(" ");
        }
        System.out.println();


        System.out.print("Enter first number (start number): ");
        int first = Integer.parseInt(input.nextLine());

        System.out.print("Enter second number (stop number): ");
        int second = Integer.parseInt(input.nextLine());

        System.out.print("X  |");

        for (int j = first; j <= second; j++) {
            System.out.printf("%5d ", j);
        }
        System.out.println();
        for (int y = first-1; y <= second; y++) {
            System.out.printf("%5s ", "-----");
        }
        System.out.println();



        for (int g = first; g <= second; g++) {
            System.out.print(g + "  |");
            for (int f = first; f <= second; f++) {
                System.out.printf("%5d ", g * f);
            }
            System.out.println(" ");
        }
    }
}

