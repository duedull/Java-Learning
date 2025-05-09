import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Restaurant");
        System.out.print("Please enter the number of items you want to order: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Fix for input skipping issue

        String[] menuItems = new String[size];

        for (int i = 0; i < menuItems.length; i++) {
            System.out.print("Enter your " + (i + 1) + " item: ");
            menuItems[i] = scanner.nextLine();  // Corrected input handling
        }

        System.out.println("\nThe Items that you have ordered are:");
        for (String item : menuItems) {
            System.out.println("- " + item);
        }

        scanner.close();
    }
}