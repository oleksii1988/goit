package com.company;

import java.util.Arrays;

public class Module3Task9 {





    public static void main(String[] args) {

        String[] array = new String[5];
        array[0]= "Misha";
        array[1]= "Alex";
        array[2]= "Grisha";
        array[3]= "Bogdan";
        array[4]= "Vova";
        String x = array[0];
        array [0] = array[array.length -1];
        array  [array.length -1] = x;



        System.out.println(Arrays.toString(array));


    }


}
