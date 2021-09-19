package com.company;

import java.util.Arrays;

public class Module3Task9 {



    public static  String [] changeElector(String[] results){

     String x = results[0];
     results[0] = results [results.length -1];
     results[results.length -1] = x;

     return results;

    }





    public static void main(String[] args) {

        String[] array = new String[5];
        array[0]= "Misha";
        array[1]= "Alex";
        array[2]= "Grisha";
        array[3]= "Bogdan";
        array[4]= "Vova";



        System.out.println(Arrays.toString(changeElector(array)));


    }


}
