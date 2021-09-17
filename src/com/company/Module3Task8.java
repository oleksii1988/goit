package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Module3Task8 {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println(Module3Task8.getInput());
    }






    public static String getInput(){

        String[] cba = new String[10];
        System.out.println("Введите правильное  значение 1");
        cba[0]  = scanner.nextLine();
        System.out.println("Введите правильное  значение 2");
        cba[1] = scanner.nextLine();

        return cba[0] + " " + "AND" + " " + cba[1] + " " + "TOGETHER";

    }





}


