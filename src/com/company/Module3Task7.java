package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Module3Task7 {

    public static Scanner scanner = new Scanner(System.in);

    public static  String []inputOutput() {
        String[] abc = new String[5];
        String[] cba = new String[2];
        System.out.println("Введите неправильное  значение 1");
        abc[0] = scanner.nextLine();
        System.out.println("Введите неправильное  значение 2");
        abc[1] = scanner.nextLine();
        System.out.println("Введите неправильное  значение 3");
        abc[2] = scanner.nextLine();
        System.out.println("Введите неправильное  значение 4");
        abc[3]  = scanner.nextLine();
        System.out.println("Введите неправильное  значение 5");
        abc[4] = scanner.nextLine();
        System.out.println("Введите правильное  значение 1");
        cba[0]  = scanner.nextLine();
        System.out.println("Введите правильное  значение 2");
        cba[1] = scanner.nextLine();
        abc[1] = cba[0];
        abc[3] = cba[1];
        return abc;
    }

    public static void sout2(){

        System.out.println(Arrays.toString(Module3Task7.inputOutput()));

    }




    public static void main(String[] args) {

    Module3Task7.sout2();

    }

}
