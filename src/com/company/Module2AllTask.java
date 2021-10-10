package com.company;

public class Module2AllTask {

    public static boolean equalsName(String name1, String name2) {

        return name1.equals(name2);

    }


    public static boolean equalsName2(String name) {


        return name.contains("A") || name.contains("O");

    }


    public static String charName(String name) {

        char a1 = name.charAt(0);
        char a2 = name.charAt(name.length() - 1);
        String a3 = String.valueOf(a1);
        String a4 = String.valueOf(a2);
        return a3.toUpperCase() + a4.toUpperCase();

    }


    public static boolean moneyName(String name) {

        char a1 = name.charAt(0);
        char a2 = name.charAt(name.length() - 1);
        return (a1 >= '0' && a1 <= '9') && (a2 >= '0' && a2 <= '9');


    }


    public static String isInvisibleName(String name) {

        return name.replace("No", "yes")
                .replace("NO", "yes")
                .replace("nO", "yes")
                .replace("no", "yes");


    }

    public static String makeNameClean(String name) {

        String s = name.trim();
        String s1 = "CLEAN";

        return s1 + s + s1;
    }


    public static String makeHalfOfName(String name) {


        return name.substring(0, name.length() / 2);

    }


    public static String encode(String name) {


        String s1 = name.replace("o", "1")
                .replace("u","2")
                .replace("i","3")
                .replace("o","4")
                .replace("a","5");
        return "NOTFORYOU"+s1+"YESNOTFORYOU";


    }

    public static String decode(String name) {


        return name.replace("1", "o")
                .replace("2","u")
                .replace("3","i")
                .replace("4","o")
                .replace("5","a")
                .replaceFirst("NOTFORYOU","")
                .replaceFirst("YESNOTFORYOU","");


    }








}
