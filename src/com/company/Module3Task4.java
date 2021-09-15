package com.company;

import java.util.Scanner;

public class Module3Task4 {

    Module3Task4 keyboard = new Module3Task4();
    public static Scanner scanner = new Scanner(System.in);

    public static void createForms(){
        System.out.println("Введите имя");
        String value1 = scanner.nextLine();
        System.out.println("Введите фамилию");
        String value2 = scanner.nextLine();
        System.out.println("Введите возраст");
        int value3 = scanner.nextInt();
        int marcYear = value3 *10;
        String resultYearName = (value1+" "+value2+" "+"Ваш возраст в марсианском счислении составляет "+marcYear+" лет");
        System.out.println(resultYearName);
        System.out.println(value1.toUpperCase());
        System.out.println(value2.toUpperCase());
        System.out.println(marcYear);




    }

    public static void main(String[] args) {

      Module3Task4.createForms();
    }

}
