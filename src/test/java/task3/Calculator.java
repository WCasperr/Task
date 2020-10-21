package task3;
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    private static int x;
    private static int y;
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
    public int division(int x, int y) { return x/y; }
    public void calc(int ops){
        Scanner sc = new Scanner(System.in);
        System.out.println("operand 1: ");
        try { //when user doesn`t enter numbers , user get message
            x = sc.nextInt();
            System.out.println("operand 2: ");
            y = sc.nextInt();
        }
        catch (InputMismatchException ex) {
            System.out.println("/////Введено не число//////");
            System.out.println("Введите заново");
        }
        switch(ops)
        {
            case(1):
                System.out.println(addition(x, y)); break;
            case(2):
                System.out.println(subtraction(x, y)); break;
            case(3):
                System.out.println(multiplication(x, y)); break;
            case(4):
                try { // when user enter second operand "0" , get message about division by zero
                    System.out.println(division(x, y));
                }
                catch (ArithmeticException e){
                    System.out.println("нельзя поделить на 0");
                } break;
            default: break;
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
} // deleted empty lines