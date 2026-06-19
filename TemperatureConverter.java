// Problem Statement: Write a program that takes temperature in Fahrenheit from the user and converts it into Celsius.
// Solution: Convert Fahrenheit to Celsius using the standard conversion formula: C = (F - 32) * 5 / 9.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        // Creating a Scanner object to read user input form the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Fahrenheit to Celsius Converter");
        
        // 1. To get the temperature in Fahrenheit from the user
        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        // 2. Applying the conversion formula (Note: integer division 5/9 would give 0, so we use math sequence carefully)
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // 3. Printing the final converted temperature in Celsius
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        
        // Closing the scanner resource to avoid memory leaks
        sc.close();
    }
}