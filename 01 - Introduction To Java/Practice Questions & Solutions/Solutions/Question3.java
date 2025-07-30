import java.util.Scanner;

public class Question3 {
    /*
    Write a program to input principal, time, and rate (P, T, R) from the user and
    find Simple Interest
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        System.out.print("Enter Rate (% per annum): ");
        double rate = sc.nextDouble();
        double interest = (principal * time * rate) / 100;
        System.out.println("Simple Interest = " + interest);
        sc.close();
    }
}
