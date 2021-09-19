package com.company;

import java.util.Arrays;

public class Module3Task11 {



    public static char[][] createKeyboard(){

        char[][] chart = {{'1', '2', '3'} ,{'4', '5', '6'},{'7', '8', '9'}, {'*', '0', '#'}};


        return chart;




    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(createKeyboard()));
    }

}
