package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        switch (number) {
            case 1:
                System.out.println("Число равно одному");
                System.out.println("Еще строка");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трем");
                break;
            default:
                System.out.println("Число не угадано");
        }

        String name = "Jack";
        switch (name) {
            case "John":
                System.out.println("Вас зовут ДЖжон");
                break;
            case "Jack":
                System.out.println("Вас зовут Джэк");
                break;
            default:
                System.out.println("Имя не угадано");

        }
    }
}
