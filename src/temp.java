package ZERO.Programs.Patterns;

import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

        // Upper half of Pascal Triangle
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of Pascal Triangle
        for (int i = row - 1; i > 0; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}