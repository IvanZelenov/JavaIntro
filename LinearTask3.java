package ru.epam.jonline.part1_basic;

import java.util.Scanner;

 /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
*       ( sin(x) + cos(y) ) / ( cos(x) - sin(y) ) * tg(x * y)
*/
public class LinearTask3 {
    public static void main(String[] args) {
        double x = inputNum('x');
        double y = inputNum('y');

        double res = ( Math.sin(x) + Math.cos(y) ) / ( Math.cos(x) - Math.sin(y) ) * Math.tan(x * y);
        System.out.println(res);

    }

    public static double inputNum(char numName) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + numName + " : ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Incorrect input. PLease enter real number " + numName + " : ");
        }

        double result = sc.nextDouble();
        sc.nextLine();
        return result;
    }
}
