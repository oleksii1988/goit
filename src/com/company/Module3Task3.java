package com.company;

import java.util.Scanner;

public class Module3Task3 {
Module3Task3 keyboard = new Module3Task3();
public static Scanner scanner = new Scanner(System.in);

public static void testLogicalOperators(){
    System.out.println("Введите значение");
    boolean s1 = scanner.nextBoolean();
    boolean s2 = scanner.nextBoolean();
    boolean s3 = scanner.nextBoolean();
    boolean result1 = s1 && s2 && s3;
    boolean result2 = s1 || s2 || s3;
    System.out.println(result1+" "+result2);
    scanner.close();


}

    public static void main(String[] args) {
        Module3Task3.testLogicalOperators();
    }

}
