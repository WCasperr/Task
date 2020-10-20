package task12;

import java.util.Random;
import java.util.Scanner;
public class Task {
    static void task1(){
        Random rand = new Random();
        int[] mass = new int[10];
        for (int i = 0; i <mass.length;i++){
            mass[i] = rand.nextInt();
            if (mass[i]<0) mass[i]= 0;
            System.out.println(mass[i]);
        }
    }
    static  void task2(){
        int sumOfWords = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines: ");
        int numberOfLines = sc.nextInt();
        String mass[] = new String[numberOfLines];
        for (int i = 0; i < numberOfLines ; i++) {
            System.out.println("enter values of these lines");
            String value = sc.next();
            mass[i] = value;
            sumOfWords += mass[i].length();
        }
        double averageLengh = sumOfWords/numberOfLines;
        System.out.println("Your average length is: " + averageLengh);
    }

    public static void main(String[] args){
        task1();
        task2();
    }
}