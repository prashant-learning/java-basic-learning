package com.learn.java.basic.day19;

public class Program19_2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("ABC");   // will not

        System.out.println(sb);

        sb.append("DEF");
        System.out.println(sb);

        // ABCDEF

        sb.insert(3, "****");
        System.out.println(sb);

        sb.replace(3, 7, "$");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(3));

        System.out.println(sb.length());

        System.out.println(sb.substring(4,7));

        System.out.println(sb.toString().toLowerCase());

        sb.delete(3, 4);
        System.out.println(sb);
    }
}
