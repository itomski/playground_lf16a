package de.gfn.playground.arrays;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        System.out.println(arr1.length);
        System.out.println(arr1);

        //ArrayTest2 at2 = new ArrayTest2();
        //System.out.println(at2);

        String output = Arrays.toString(arr1);
        output = Arrays.toString(new double[]{7.5, 8.22, 9.123}); // anonymes Array
        System.out.println(output);
        System.out.println();

        byte[] b1 = new byte[5];
        System.out.println(Arrays.toString(b1));
        System.out.println();

        short[] s1 = new short[5];
        System.out.println(Arrays.toString(s1));
        System.out.println();

        int[] i1 = new int[5];
        System.out.println(Arrays.toString(i1));
        System.out.println();

        long[] l1 = new long[5];
        System.out.println(Arrays.toString(l1));
        System.out.println();

        float[] f1 = new float[5];
        System.out.println(Arrays.toString(f1));
        System.out.println();

        double[] d1 = new double[5];
        System.out.println(Arrays.toString(d1));
        System.out.println();

        char[] c1 = new char[5];
        System.out.println(Arrays.toString(c1));
        System.out.println();

        Object[] o1 = new Object[5];
        System.out.println(Arrays.toString(o1));
        System.out.println();

        var zahl1 = 1; // Standard für Ganzzahlen ist int
        var zahl2 = 7.0; //  Standard für Fließkommazahlen ist double

        float f2 = 10.0f;
        long l2 = 100_000_000_000l;
        byte b2 = 127;

        // System.out.println(o1[5]); // ArrayIndexOutOfBoundsException
        // int[] i2 = new int[-10]; // NegativeArraySizeException





    }

    @Override
    public String toString() {
        return "...";
    }
}
