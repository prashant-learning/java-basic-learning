package com.learn.java.basic.day19;

/**
 *
 *     String is implementing CharSequence
 *
 *     String is an immutable  -> Once you crate it you cannot modify it
 *
 *     "abc".concat("exy")
 *
 *     abcexy
 *
 *     Mutable strings are created by
 *        1. StringBuilder    // thread not safe
 *        2. StringBuffer    // thread safe   -> application will be slow / costly operation
 *        3. String literals
 *        4. with new keyword  -> avoid using this
 *
 *
 *     String constant pool  ->
 *
 *
 */



public class Program19 {

    public static void main(String[] args) {

        //string literals
        String str1 = "abc";

        String str2 = "abc";

        System.out.println(str1 == str2);

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str3.equals(str4));

       //  equals   ( compares values )
        //  ==      (compares memory address)

        str1 =  str1.concat("def"); //abcdef

        str1 = str1.concat("ghi");


        System.out.println(str1);


        StringBuffer sb = new StringBuffer("ABC");   // will not

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
