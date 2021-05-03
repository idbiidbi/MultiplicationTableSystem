//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MultiplicationTable {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int[][] table = new int[10][10];
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++) {
//                table[i][j] = (i + 1) * (j + 1);
//            }
//        }
//
//        for (int[] a: table) {
//            for (int i: a) {
//                System.out.print(i + "\t");
//            }
//            System.out.print("\n");
//        }
//        System.out.println();
//
//
//
//        System.out.print("Enter first number (start number): ");
//        int first = Integer.parseInt(input.nextLine());
//
//        System.out.print("Enter second number (stop number): ");
//        int second = Integer.parseInt(input.nextLine());
//
//        int[][] userTable = new int[second-first+1][second-first+1];
//        for (int i = 0; i < userTable.length; i++) {
//            for (int j = 0; j < userTable[i].length; j++) {
//                userTable[i][j] = (i + first) * (j + first);
//            }
//        }
//        for (int i = first; i <= second; i++) {
//            System.out.print(i + "\t");
//        }
//        System.out.println("\n--------------------------------------");
//
//        for (int i = first; i <= second; i++) {
//            System.out.println(i + "|" + "\t");
//            for (int[] a: userTable) {
//                for (int num: a) {
//                    System.out.print(num + "\t");
//                }
//                System.out.print("\n");
//            }
//        }
//    }
//}
//
