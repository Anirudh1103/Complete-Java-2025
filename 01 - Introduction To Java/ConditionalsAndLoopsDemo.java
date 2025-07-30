import java.util.Scanner;

public class ConditionalsAndLoopsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -----------------------------------
        // Part 1: Conditionals
        // -----------------------------------
        System.out.println("== CONDITIONAL STATEMENTS ==");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // if-else-if ladder
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // switch-case example
        System.out.print("\nEnter a number (1 to 7) to find the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;
            default:
                System.out.println("Invalid input. Enter a number between 1 and 7.");
        }

        // -----------------------------------
        // Part 2: Loops
        // -----------------------------------
        System.out.println("\n== LOOPS ==");

        // FOR LOOP - print numbers from 1 to 5
        System.out.println("\nFor Loop: Print numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // WHILE LOOP - print even numbers up to N
        System.out.print("\nEnter a number to print all even numbers up to it: ");
        int n = scanner.nextInt();
        int i = 1;

        System.out.println("Even numbers from 1 to " + n + ":");
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // DO-WHILE LOOP - run at least once
        int password;
        System.out.println("\nEnter password (hint: 1234) to access:");
        do {
            System.out.print("Password: ");
            password = scanner.nextInt();
            if (password != 1234) {
                System.out.println("Wrong password. Try again.");
            }
        } while (password != 1234);
        System.out.println("Access granted!");

        scanner.close();
    }
}
