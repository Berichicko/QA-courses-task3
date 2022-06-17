package aleksandr.zasinets.calculator;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (scanner.hasNextLine()) {
            int sum = (int) ((a + b));
            int multiplication = (int) ((a * b));
            System.out.println("Сумма двух чисел" + " " + sum);
            System.out.println("Произведение двух чисел" + " " + multiplication);

            }
        scanner.close();


    }

 }
