package com.inamul;

public class PracticeProblemOnGenerics<E extends Comparable> {
    E x, y, z;

    public PracticeProblemOnGenerics(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <E extends Comparable<E>> E testMaximum(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return (max);
    }
        public static void main (String[]args){
            System.out.println(testMaximum(25,45,75));
            System.out.println(testMaximum(36.5,28.0,38.75));
            System.out.println(testMaximum("Apple","Mango","Banana"));
        }
    }

