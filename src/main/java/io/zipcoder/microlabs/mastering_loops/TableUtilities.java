package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        //    Generate a String representation of a multiplication table whose dimensions are 4 by 4
        String s = "";

        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                s += String.format("%3d |", i * j);
            }
            s += "\n";
        }
        return s;
    }





    public static String getLargeMultiplicationTable() {
        //     Generate a String representation of a multiplication table whose dimensions are 9 by 9
        String s = "";

        for(int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                s += String.format("%3d |", i * j);
            }
            s += "\n";
        }
        return s;
    }



    public static String getMultiplicationTable(int tableSize) {
        //      Given one integer, width, generate a String representation of a multiplication table whose dimensions are width by width
        String s = "";

        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                s += String.format("%3d |", i * j);
            }
            s += "\n";
        }
        return s;
    }
}
