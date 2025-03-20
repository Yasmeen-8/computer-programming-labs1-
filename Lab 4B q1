import java.util.Scanner;

public class Calculator {
    // static Scanner; scanner input can be used in multiple methods 
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // 1. call readNumber() to read number from user and store in num1 and num2
        int num1;
        int num2;
        
        num1 = readNumber();
        num2 = readNumber();
        
        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        
        // 5. call subtract and multiply method passing num1 and num2
    }
    
    // Method to read input (number) from user
    public static int readNumber() {
        System.out.println("Enter a number: ");
        return input.nextInt();
    }
    
    // 2. Write a method (name: add) to print the sum of two numbers passed as parameters
    public static void add(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("Sum is: " + sum);
    }

    
    // 3. Write a method (name: subtract) to print the difference of two numbers passed as paramters
    public static void subtract(int number1, int number2){
        int sub = number1 - number2;
        System.out.println("Difference is: " + sub);
    }
    
    // 4. Write a method (name: multiply) to print the product of two numbers passed as paramters
    public static void multiply(int number1, int number2){
        int multi = number1*number2;
        System.out.println("product is: " + multi);
    }
  
}
