package com.fatima;

public class SortableArray {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 8, 1, 6};
        String[] stringArray = {"banana", "apple", "orange", "grapes"};

        SortIntegerArray.sort(intArray);
        
        SortStringArray.sort(stringArray);

        System.out.println("Sorted Integer Array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nSorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}
//hello my name is fatima