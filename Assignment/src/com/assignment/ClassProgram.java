package com.assignment;

/*import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        
        // Read the number from user input
        int number = scanner.nextInt();
        
        // Validate if the number is non-negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using a loop
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            // Print the factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
        // Close the scanner
        scanner.close();
    }
}


// 2

import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        
        // Read the number from user input
        int number = scanner.nextInt();
        
        // Calculate the number of digits
        int originalNumber = number;
        int numDigits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            numDigits++;
        }
        
        // Reset originalNumber for calculation
        originalNumber = number;
        int sum = 0;
        
        // Calculate sum of cubes of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numDigits);
            originalNumber /= 10;
        }
        
        // Check if number is Armstrong or not
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}


//3 
import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        // Read the number from user input
        int number = scanner.nextInt();
        int originalNumber = number;
        
        // Variables for reversing the number
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Determine if the original number is positive or negative
        if (originalNumber > 0) {
            System.out.println("Original number is positive.");
        } else if (originalNumber < 0) {
            System.out.println("Original number is negative.");
        } else {
            System.out.println("Original number is zero.");
        }
        
        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
        // Close the scanner
        scanner.close();
    }
}

//4

import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        // Read the number from user input
        int number = scanner.nextInt();
        int originalNumber = number;
        
        // Variables for reversing the number and checking palindrome
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Check if originalNumber is same as reversedNumber
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

//5
import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        // Read the number from user input
        int number = scanner.nextInt();
        
        // Variables for counting digits
        int count = 0;
        int originalNumber = number;
        
        // Count digits in the number
        do {
            count++;
            originalNumber /= 10;
        } while (originalNumber != 0);
        
        // Print the count of digits
        System.out.println("Number of digits in " + number + " is: " + count);
        
        // Close the scanner
        scanner.close();
    }
}

//6
import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n) to print prime numbers up to n: ");
        int n = scanner.nextInt();
        
        System.out.println("Prime numbers up to " + n + " are:");
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// 7

import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        // Print Fibonacci series
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        
        // Close the scanner
        scanner.close();
    }
}


//8

import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its mathematical table: ");
        int number = scanner.nextInt();
        
        // Print forward order table
        System.out.println("\nForward Order Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Print reverse order table
        System.out.println("\nReverse Order Table of " + number + ":");
        for (int i = 10; i >= 1; i--) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Close the scanner
        scanner.close();
    }
}

//9
import java.util.Scanner;

public class ClassProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a positive integer to find its factors: ");
        int number = scanner.nextInt();

        // Close scanner
        scanner.close();

        System.out.print("Factors of " + number + " are: ");

        // Find and print factors
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}*/

//10

import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final int MAX_PIZZA_BOXES = 2;
        final int SLICES_PER_BOX = 6;
        final int SLICES_PER_PERSON = 3;

        // Initial state
        int currentPizzaBoxes = 2;
        int currentSlices = currentPizzaBoxes * SLICES_PER_BOX;

        System.out.println("Initially, there are " + currentSlices + " slices of pizza available.");

        while (true) {
            System.out.print("Enter the number of people (or 0 to quit): ");
            int numPeople = scanner.nextInt();

            if (numPeople == 0) {
                System.out.println("Exiting program.");
                break;
            }

            int slicesNeeded = numPeople * SLICES_PER_PERSON;

            if (slicesNeeded > currentSlices) {
                System.out.println("Not enough pizza slices for " + numPeople + " people.");
                System.out.println("Current slices available: " + currentSlices);
            } else {
                System.out.println("There are enough pizza slices for " + numPeople + " people.");
                currentSlices -= slicesNeeded;
                System.out.println("Remaining slices after serving " + numPeople + " people: " + currentSlices);

                // If we run out of slices, simulate having to open a new box
                if (currentSlices == 0) {
                    if (currentPizzaBoxes < MAX_PIZZA_BOXES) {
                        currentPizzaBoxes++;
                        currentSlices = currentPizzaBoxes * SLICES_PER_BOX;
                        System.out.println("Opened a new pizza box. Now there are " + currentSlices + " slices available.");
                    } else {
                        System.out.println("No more pizza boxes left.");
                    }
                }
            }
        }

        scanner.close();
    }
}











