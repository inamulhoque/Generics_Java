package com.inamul;

public class PracticeProblemOnGenerics{
    public static <String extends Comparable<String>> String testMaximum(String x, String y, String z){
        String max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum is: "+testMaximum("Peach", "Apple","Banana"));
    }
}
