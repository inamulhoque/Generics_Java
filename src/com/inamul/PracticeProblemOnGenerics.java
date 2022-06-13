package com.inamul;

public class PracticeProblemOnGenerics <E>{
    public static <E extends Comparable<E>> E testMaximum(E x, E y, E z){
        E max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum is: "+testMaximum(4,48,12));
        System.out.println("Maximum is: "+testMaximum("Banana", "Apple","Peach"));
        System.out.println("Maximum is: "+testMaximum(22.34,15.12,10.99));
    }
}
