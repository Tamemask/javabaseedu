package part1.lesson01.task01.separate2;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите зарплату до вычета 13%");
        double raw = in.nextDouble();
        double pure = raw*0.87;
        System.out.println("Зарплата после вычета " + pure);
    }
}
