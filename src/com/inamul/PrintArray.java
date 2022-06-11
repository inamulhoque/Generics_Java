package com.inamul;

public class PrintArray <x,y,z>{
    x[] myxArray;
    y[] myyArray;
    z[] myzArray;

    public PrintArray(x[] myxArray, y[] myyArray, z[] myzArray) {
        this.myxArray = myxArray;
        this.myyArray = myyArray;
        this.myzArray = myzArray;
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        Double[] b = {1.1,2.2,3.3,4.4,5.5};
        Character[] c = {'a','b','c','d','e'};
        toPrint(a);
        toPrint(b);
        toPrint(c);
        new PrintArray<Integer,Double,Character>(a,b,c).toPrint();
    }
    private void toPrint(){
        toPrint(myxArray);
        toPrint(myyArray);
        toPrint(myzArray);
    }

    private static <E> void toPrint(E[] a) {
        for (E i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
