package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

//  In the class, Triangles Write a method that returns a String representation of a row of asterisks whose length is equal to the width specified.
    public static String getTriangle(int numberOfRows) {
        //call getRows()
        String s = "";
        for(int i = 1; i < numberOfRows; i++) {
            s += getRow(i);
            if (i < numberOfRows) {
                s += "\n";
            }
        }
        return s;
    }

    public static String getRow(int numberOfStars) {
        String s = "";
        for(int i = 0; i < numberOfStars; i++) {
            s += "*";
        }
        return s;
    }
    //length is equal to width in this triangle

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
