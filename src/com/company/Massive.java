package com.company;

import java.util.Arrays;

public class Massive {


    public static void main(String[] args) {


        String[][] strings = new String[5][3];
        strings[0][0] = "Hello";
        strings[0][1] = "Java";
        strings[0][3] = "Vasia";
        strings[1][0] = "Petia";
        strings[1][1] = "Hahaha";
        strings[1][2] = "Hahaha";

     for(int i = 0; i< strings.length; i++){

         System.out.println(Arrays.toString(strings));
     }


    }

}
