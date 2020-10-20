package task3;

import java.lang.*;
import java.util.Scanner;

public class Calculator {
    private int solution;
    private static int x;
    private static int y;
    private char operators;


    public Calculator()
    {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
    }



    public int addition(int x, int y)
    {
        return x + y;
    }
    public int subtraction(int x, int y)
    {
        return x - y;
    }
    public int multiplication(int x, int y)
    {
        return x * y;
    }
    public int division(int x, int y)
    {
        solution = x / y;
        return solution;
    }



    public void calc(int ops){
        Scanner sc = new Scanner(System.in);
        System.out.println("operand 1: ");
        x = sc.nextInt();
        System.out.println("operand 2: ");
        y = sc.nextInt();
        switch(ops)
        {
            case(1):
                System.out.println(addition(x, y));
                break;
            case(2):
                System.out.println(subtraction(x, y));
                break;
            case(3):
                System.out.println(multiplication(x, y));
                break;
            case(4):
                System.out.println(division(x, y));
                break;
        }
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What operation? ('+', '-', '*', '/')");
        System.out.println(" Enter 1 for Addition");
        System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multiplication");
        System.out.println(" Enter 4 for Division");
        Calculator calc = new Calculator();
        calc.calc(sc.nextInt());



    }
}