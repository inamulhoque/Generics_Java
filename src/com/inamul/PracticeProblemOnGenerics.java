package com.inamul;

public class PracticeProblemOnGenerics{
    public static <Float extends Comparable<Float>> Float testMaximum(Float x, Float y, Float z){
        Float max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum is: "+testMaximum(20.8, 25.2,112.4));
    }
}
