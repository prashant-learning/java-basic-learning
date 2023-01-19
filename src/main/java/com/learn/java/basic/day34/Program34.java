package com.learn.java.basic.day34;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program34 {

    public static void main(String[] args) {

        // [2, 7, 11, 15]  target = 9

        int[] inputArray = {2,7,11,15, 20};
        int target = 35;

        Map<Integer, Integer> mapping = new LinkedHashMap<>();

        int i = 0;
        for (Integer temp: inputArray){
            mapping.put(temp, i);
            i++;
        }

        int firstIndex = -1;
        int sndIndex = -1;

        for(int j =0; j < inputArray.length; j++){

            int rem = target - inputArray[j];

            if(mapping.containsKey(rem)){
                firstIndex = j;
                sndIndex =  mapping.get(rem);
                break;
            }

        }
        System.out.println(firstIndex + "   " + sndIndex);




    }
}
