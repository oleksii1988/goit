package com.company;

import java.util.Scanner;

public class Module3Task2 {
Module3Task2 keyboard2 = new Module3Task2();
public static Scanner scanner = new Scanner(System.in);

public static void inputOutput(){
    System.out.println("Введите первое число");
    int sc1 = scanner.nextInt();
    System.out.println("Введите второе число");
    int sc2 = scanner.nextInt();
    int result1 = sc1 + sc2;
    int result2 = sc1 - sc2;
    int result3 = sc1 * sc2;
    int result4 = sc1 / sc2;
    System.out.printf("%d %d %d %d%n", result1, result2, result3, result4);

}

    public static void main(String[] args) {

    Module3Task2.inputOutput();
    }

}
