package ru.innopolis.stc.java.lesson8.task3;

public class Conrtact {
    // В каждом сделать поля: номер, дата, список товаров (массив строк).
    private int number;
    private String date;
    private String[] array;

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
