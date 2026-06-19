// Problem Statement: Write a program that takes two numbers as input from the user and prints their sum, difference, and product all at once.
// Solution: Capture two numbers from the user and perform basic arithmetic operations (+, -, *).

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        
        // Creating a Scanner object to read keyboard inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        
        // 1. To get the first number from the user
        System.out.print("Enter first number: ");
        double NUM_1 = sc.nextDouble();
        
        // 2. To get the second number from the user
        System.out.print("Enter second number: ");
        double NUM_2 = sc.nextDouble();
        
        // 3. Performing basic math operations
        double sum = NUM_1 + NUM_2;
        double diff = NUM_1 - NUM_2;
        double product = NUM_1 * NUM_2;
        
        // 4. Printing the final calculated results for all operations
        System.out.println("Results:");
        System.out.println("Addition (+): " + sum);
        System.out.println("Subtraction (-): " + diff);
        System.out.println("Multiplication (*): " + product);
                
        // Closing the scanner resource to prevent memory leaks
        sc.close();
    }
}