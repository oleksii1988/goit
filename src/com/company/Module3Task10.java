package com.company;

import java.util.Arrays;

public class Module3Task10 {

    public static String[] changeElectResultAgain(String[] results) {

        String[] y = new String[3];
        System.arraycopy(results,2,y,0,3);
        return y;

    }


    public static void main(String[] args) {

        String[] array = new String[5];
        array[0] = "Misha";
        array[1] = "Alex";
        array[2] = "Grisha";
        array[3] = "Bogdan";
        array[4] = "Vova";


        System.out.println(Arrays.toString(changeElectResultAgain(array)));



    }
}