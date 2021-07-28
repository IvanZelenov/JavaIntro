package ru.epam.jonline.part1_basic;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class CycleTask1 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter positive integer number.");
        num = inputNum("number");
        num = checkValue(num, "number");

        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += i;
        }
        System.out.println("Sum from 1 to " + num + " = " + count);
    }

    private static int inputNum(String numName) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + numName + " : ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Incorrect input. PLease enter positive integer" + numName + " : ");
        }

        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }

    //Cant have zero as positive number due to conditions of the task
    //since we are calculating sum from 1 to num
    private static int checkValue(int value, String numName) {
        while (value < 1) {
            System.out.println("Incorrect input. Please enter positive integer number.");
            value = inputNum(numName);
        }
        return value;
    }
}
