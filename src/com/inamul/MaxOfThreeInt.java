package com.inamul;

public class MaxOfThreeInt <E>{
    public static <E extends Comparable<E>> E testMax(E x, E y, E z){
        E max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum is:"+testMax("Apple","Peach","Banana"));
        System.out.println("Maximum is:"+testMax(15,9,23));
        System.out.println("Maximum is:"+testMax(2.3,12.9,9.602));
        System.out.println("Maximum is:"+testMax('A','s','W'));
    }
}
