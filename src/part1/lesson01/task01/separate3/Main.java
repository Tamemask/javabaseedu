package part1.lesson01.task01.separate3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        double amount = in.nextDouble();
        double hrs = amount/3600;
        System.out.println(amount + " секунд равно " + hrs + " часов");
    }
}
