import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and a text:");
        int number = scanner.nextInt();
        System.out.println("You entered number: " + number);
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        System.out.println("Hello, World!");
        System.out.println("You entered text: " + text);
        System.err.println("you enterred a number: " + number);
        scanner.close();
    }
}