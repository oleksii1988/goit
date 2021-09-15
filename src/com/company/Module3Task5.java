package com.company;
import java.util.*;
public  class Module3Task5 {


public static String[] createEmptyNameArray(){
    String [] result = new String[5];
    result[0] = "Apple";
    result[1] = "Banena";
    result[2] = "Lemon";
    return result;

}

public static void sout(){

    System.out.println(Arrays.toString(Module3Task5.createEmptyNameArray()));
}

    public static void main(String[] args) {

    Module3Task5.sout();
}

}
