package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17SortArray {
    public static void main(String[] args) {
        //Numeric array declaration
        int[] numarray = { 1789,2035,1899,2040,1950,2255,7897,1455, 787};
        // String Array declaration
        String[] strarray = {"Alpha","Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual Numerical Array was:" + Arrays.toString(numarray));
        //Sorting the array
        Arrays.sort(numarray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numarray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strarray));
        //Sorting the array
        Arrays.sort(strarray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strarray));
    }

    }

