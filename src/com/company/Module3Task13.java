package com.company;

import java.util.Arrays;

public class Module3Task13 {

    public static   String[] makeCopy(String[] names){


        String[] copy = Arrays.copyOf(names, names.length);
        System.out.println("!COPIED");

        return copy;



    }

    public static void main(String[] args) {

        String[] array = new String[5];
        array[0]= "Misha";
        array[1]= "Alex";
        array[2]= "Grisha";
        array[3]= "Bogdan";
        array[4]= "Vova";




        System.out.println(Arrays.toString(makeCopy(array)));





    }
}
