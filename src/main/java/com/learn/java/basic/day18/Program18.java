package com.learn.java.basic.day18;

/**
 *    String  -> array of  char
 *
 *    String name = "Joshep"
 *
 *    char[] nameCharArray = {'J', 'o', 's', 'h', 'e', 'p'}
 *
 *    1. str1.toCharArray()    -> to convert a string to char array
 *    2. str1.length()         -> size/length of the string
 *    3. str1.charAt(index)    -> character at index i
 *    4. substring(startIndex)
 *    5. substring(startIndex, endIndex)   -> where endIndex is exclusive
 *    6. contains()
 *    7. equals() or equalsIgnoreCase()
 *    8. isEmpty or isBlank
 *    9. replace, replaceFirst or replaceAll
 *    10. split
 *    11. indexOf
 *    12. toLowerCase() toUpperCase()
 *    13. trim
 *    15. valueOf
 *
 */

public class Program18 {

    public static void main(String[] args) {


        char[] nameCharArray = {'J', 'o', 's', 'h', 'e', 'p'};

        String name = new String(nameCharArray);

      //  System.out.println(name);

        String countryName = "India";

        // 2 way to convert a String to char array

        char[] countryNameChar = countryName.toCharArray();

        System.out.println(countryNameChar);

        // Without using any string function convert a string to char array

        char[] customCountryNameCharArray = new char[countryName.length()];

        for (int i = 0; i < customCountryNameCharArray.length; i++){
            customCountryNameCharArray[i] = countryName.charAt(i);
        }

        for (char temp: customCountryNameCharArray){
           // System.out.println(temp);
        }


        System.out.println(countryName.charAt(4));


        String str1 = "I love my india";

        // substring function

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,6));

        // contains

        String str2 = "I ";

        boolean check = str1.contains(str2);  // true or false
        System.out.println(check);

        // equals() or equalsIgnoreCase()

        String str3 = "America";
        String str4 = "AmERiCA";

        boolean isSame =  str3.equals(str4);
        System.out.println(isSame);

        boolean isCaseSensitiveSame =  str3.equalsIgnoreCase(str4);

        System.out.println(isCaseSensitiveSame);


        // isEmpty or isBlank

        String str5 = "3";

        System.out.println(str5.isBlank());

        // replace, replaceFirst or replaceAll

        String str6 = "I am from America and i don't speak hindi";

        System.out.println(str6.replace('i', 'I'));

        System.out.println(str6.replaceFirst("i", "I"));
        System.out.println(str6.replaceAll("i", "I"));

        // split | $

        String str7 = "IALPHALOVEALPHAINDIAALPHAAMERICAALPHAMONEYALPHANAME";

        String[] splitedArray = str7.split("ALPHA");


        System.out.println(splitedArray.length);

        for (String temp : splitedArray){
            System.out.println(temp);
        }

        // indexOf

        String str8 = "LOVELY PEOPLE";

        System.out.println(str8.indexOf("LOVE"));

        // toLowerCase() toUpperCase()

        System.out.println(str8.toLowerCase());

        String str9 = "all lower case";

        System.out.println(str9.toUpperCase());

        // trim

        String str10 = "    Lovely Indian       ";

        System.out.println(str10);

        String str11 = str10.trim();
        System.out.println(str11);

        // valueOf

        int age = 10;

        String ageString = String.valueOf(age);
        System.out.println(ageString);

        // concat

        String nameString = "ALPHA ";
        String greetingString  = "Welcome you ";

        System.out.println(nameString.concat(greetingString));
        System.out.println( nameString + greetingString);
    }
}
