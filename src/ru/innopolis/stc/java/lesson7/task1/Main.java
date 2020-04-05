package ru.innopolis.stc.java.lesson7.task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static int productNumber;
    static int paidSumm;

    /*
    * Реализовать программу «Вендинговый автомат», которая позволит:
    * Посмотреть меню напитков
    * Внести деньги на внутренний счет
    * Выбрать номер напитка и получить его, если на счету достаточно средств.
    * Программа должна обрабатывать следующие ситуации:
    * Пользователь не внес деньги
    * Пользователь выбрал более дорогой напиток, чем внесено денег
    * Пользователь выбрал несуществующий номер напитка
    * Для хранения напитков предлагается использовать массив с enum. У напитка должна быть цена и название.
    * - Переписать проект с урока (вендинговый автомат) используя конструктор, перечисления и
взаимодействие с пользователем.
* */

    //можно сделать несколько операций до выхода из программы - например купить несколько напитков
    //отделить операцию выбора от операции внесения
    //проверка, что денег достаточно

    enum Drink {COLA, ORANGE, MINERAL, LEMONADE;}


    static class Product {
        static int priceOfProduct;

        Product(int productNumber) {
            switch (productNumber) {
                case 1:
                    setPrice(100);
                    break;
                case 2:
                    setPrice(180);
                    break;
                case 3:
                    setPrice(150);
                    break;
                case 4:
                    setPrice(50);
                    break;
                default:
                    System.out.println("Введен не корректный номер, попробуйте еще раз.");
                    getProductNumber();
            }

            showPrice();
            paidSumm = in.nextInt();
        }

        void setPrice(int price) {
            priceOfProduct = price;
        }

        void showPrice() {
            System.out.println("Введите " + priceOfProduct + " рублей");
        }

        private static void assertSumms() {
            if (paidSumm >= priceOfProduct) {
                System.out.println("Заберите товар. Ваша сдача " + (paidSumm - priceOfProduct) + " рублей");
            } else {
                takeMoreOrRefund();
            }
        }

        private static void takeMoreOrRefund() {
            int difference = priceOfProduct-paidSumm;
            System.out.println("Не хватает " + difference + " рублей");
            System.out.println("Введите 1 чтобы внести еще средства. введите другое число, чтобы вернуть себе деньги");
            int decision = in.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Введите " + difference + " рублей или больше");
                    takeMore();
                    break;
                default:
                    System.out.println("Возврат " + paidSumm + " рублей");
            }
        }


        private static void takeMore() {
            int more = in.nextInt();
            paidSumm += more;
            assertSumms();
        }


    }

    public static void main(String[] args) {
        getProductNumber();
        showProductPrice();
        Product.assertSumms();
    }

    private static void showProductPrice() {
        Product p = new Product(productNumber);
    }

    static void getProductNumber() {
        System.out.println("Какой напиток хотите купить?");
        int i = 1;
        for (Drink d : Drink.values()) {
            System.out.println("если " + d + " - введите " + i);
            i++;
        }
        productNumber = in.nextInt();
    }


}
