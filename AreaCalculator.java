// Problem Statement: Write a program to take the length and breadth of a rectangle as input from the user and calculate its area.
// Solution: Take length and breadth of a rectangle from the user and calculate its area (Area Formula: Area = length * breadth).

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        
        // Creating a Scanner object to get keyboard inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Rectangle Area Calculator");
        
        // 1. To get the length of the rectangle from the user
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();
        
        // 2. To get the breadth of the rectangle from the user
        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();
        
        // 3. Applying the Area formula
        double area = length * breadth;
        
        // 4. Printing the final calculated area of the rectangle
        System.out.println("The Area of the Rectangle is: " + area);
        
        // Closing the scanner resource to prevent memory leaks
        sc.close();
    }
}