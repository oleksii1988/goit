package com.company;

import java.util.Arrays;

public class Module3Task6 {



    public static int[] createEmptyNameArray(int one, int two, int three, int four) {
        int[] array = {one,two,three,four};
        return array;
    }

    public static void sout(){

        System.out.println(Arrays.toString(Module3Task6.createEmptyNameArray(100,200,300,400)));

    }



    public static void main(String[] args) {

      Module3Task6.sout();

    }


}
