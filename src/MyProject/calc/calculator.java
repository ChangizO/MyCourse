package MyProject.calc;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int firstNumber = getInt();
        int secondNumber = getInt();
        char operation = getOperation();
        int result = calculate(firstNumber, secondNumber, operation);
        System.out.println(result);
    }


    public static int getInt() {
        System.out.print("Enter your number");
        Scanner scan = new Scanner(System.in);
        int number = 0;
        if (scan.hasNextLine()) {
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number > 10) {
                    throw new RuntimeException("The value must be in the range from 0 to 10");
                }
            } else {
                number = converter(scan.nextLine());
                if (number > 10) {
                    throw new RuntimeException("The value must be in the range from 0 to 10");
                }
            }
        } else {
            System.out.println("Invalid number, please try again");
            scan.next();
            number = getOperation();
        }
        return number;
    }

    public static char getOperation() {
        System.out.println("Enter operation");
        Scanner scan = new Scanner(System.in);
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Invalid operation, please try again");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calculate(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 + num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation, please try again");
                result = calculate(num1, num2, getOperation());
        }
        return result;
    }

    public static int converter(String s) {
        if (s.equals("I")) {
            return 1;
        }
        if (s.equals("II")) {
            return 2;
        }
        if (s.equals("III")) {
            return 3;
        }
        if (s.equals("IV")) {
            return 4;
        }
        if (s.equals("V")) {
            return 5;
        }
        if (s.equals("VI")) {
            return 6;
        }
        if (s.equals("VII")) {
            return 7;
        }
        if (s.equals("VIII")) {
            return 8;
        }
        if (s.equals("XI")) {
            return 9;
        }
        if (s.equals("X")) {
            return 10;
        }
        return 0;
    }


}
