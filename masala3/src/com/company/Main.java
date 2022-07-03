package com.company;

public class Main {

    public static void main(String[] args) {
        shifrlash("dasturchi");
    }

    public static void shifrlash(String str) {
        str.replaceAll("f", "y");
        str.replaceAll("l", "a");
        str.replaceAll("j", "o");

        char[] chars = str.toCharArray();
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'r') chars[i] ='s';
            else if (chars[i] == 'o') chars[i] ='l';
            else if (chars[i] == 'b') chars[i] ='c';
            else if (chars[i] == 'c') chars[i] ='d';
            else if (chars[i] == 'n') chars[i] ='k';
            else if (chars[i] == 't') chars[i] ='e';
            else if (chars[i] == 'e') chars[i] ='p';
            else if (chars[i] == 's') chars[i] ='t';
            else if (chars[i] == 'd') chars[i] ='o';
            else if (chars[i] == 'a') chars[i] ='t';
            else if (chars[i] == 'u') chars[i] ='f';
            else if (chars[i] == 'h') chars[i] ='e';
            else if (chars[i] == 'i') chars[i] ='f';
            else if (chars[i] == 'f') chars[i] ='y';
            else if (chars[i] == 'l') chars[i] ='a';
            else if (chars[i] == 'j') chars[i] ='o';

            s +=chars[i];
        }

        System.out.println(s);
    }
}
