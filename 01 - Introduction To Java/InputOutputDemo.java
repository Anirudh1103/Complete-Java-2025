import java.util.Scanner;  // Import Scanner class to take input

public class InputOutputDemo {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // 1. Input: String (name)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads full line including spaces

        // 2. Input: int (age)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Reads an integer

        // 3. Input: double (height)
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();  // Reads a decimal value

        // 4. Input: char (grade)
        System.out.print("Enter your grade (A/B/C): ");
        char grade = scanner.next().charAt(0);  // Reads first character

        // Output: Displaying the values entered
        System.out.println("\n--- Output ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age + " years");
        System.out.println("Height : " + height + " meters");
        System.out.println("Grade  : " + grade);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
