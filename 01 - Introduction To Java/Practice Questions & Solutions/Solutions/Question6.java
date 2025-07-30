import java.util.Scanner;

public class Question6 {
    /*
     Input currency in rupees and output in USD.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();
        double usd = inr / 83.0; // Example conversion rate
        System.out.printf("Equivalent in USD: %.2f\n", usd);
        sc.close();
    }
}
