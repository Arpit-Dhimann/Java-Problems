// Problem Statement: Write a program to calculate Simple Interest. Take Principal, Rate of Interest, and Time (in years) as input from the user.
// Solution: Calculate Simple Interest based on user input for Principal, Rate, and Time (Formula: SI = (Principal * Rate * Time) / 100).

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        // Creating a Scanner object to get keyboard inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Interest Calculator");
        
        // 1. To get the Principal Amount from the user
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        
        // 2. To get the Rate of Interest in percentage from the user
        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();
        
        // 3. To get the Time duration in years from the user
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        
        // 4. Here applying the standard Simple Interest formula
        double si = (principal * rate * time) / 100;
        
        // 5. Printing the final calculated interest and the total calculated amount
        System.out.println("Calculated Simple Interest: " + si);
        System.out.println("Total Amount to Pay: " + (principal + si));
        
        // Closing the scanner resource to avoid memory leaks
        sc.close();
    }
}