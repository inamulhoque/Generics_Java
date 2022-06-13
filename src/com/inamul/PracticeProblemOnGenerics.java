package com.inamul;

public class PracticeProblemOnGenerics{
    public static <Integer extends Comparable<Integer>> Integer testMaximum(Integer x, Integer y, Integer z){
        Integer max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum is: "+testMaximum(75,102,55));
    }
}
