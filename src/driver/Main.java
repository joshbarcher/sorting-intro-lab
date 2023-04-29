package driver;

import searches.JumpSearch;
import sorts.MergeSort;
import sorts.Sorts;
import utility.SortingUtilities;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] intArray = SortingUtilities.generateRandomArray(20, 0, 50);
        for(int number : intArray){
            System.out.print(number + ", ");
        }
        System.out.print(System.lineSeparator());
        Sorts sorter = new Sorts();
        sorter.selectionSort(intArray);
        if(SortingUtilities.detectAdjacentInversions(intArray)){
            System.out.println("Detected inversions: this array is NOT sorted.");
        }else{
            System.out.println("Detected 0 inversions in the array.");
        }

        System.out.print(System.lineSeparator());

        int[] intArray2 = SortingUtilities.generateRandomArray(20, 0, 50);
        for(int number : intArray2){
            System.out.print(number + ", ");
        }
        System.out.print(System.lineSeparator());
        sorter.insertionSort(intArray2);
        if(SortingUtilities.detectAdjacentInversions(intArray)){
            System.out.println("Detected inversions: this array is NOT sorted.");
        }else{
            System.out.println("Detected 0 inversions in the array.");
        }

        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.println("Merge Sort:");

        int[] intArray4mergesort = SortingUtilities.generateRandomArray(50, 0, 100);
        for(int number : intArray4mergesort){
            System.out.print(number + ", ");
        }
        System.out.print(System.lineSeparator());
        MergeSort mergeSort = new MergeSort();
        mergeSort.iMergeSort(intArray4mergesort);
        if(SortingUtilities.detectAdjacentInversions(intArray4mergesort)){
            System.out.println("Detected inversions: this array is NOT sorted.");
        }else{
            System.out.println("Detected 0 inversions in the array.");
        }
        System.out.print(System.lineSeparator());
        for(int number : intArray4mergesort){
            System.out.print(number + ", ");
        }
        System.out.print(System.lineSeparator());

        int[] intArray3 = SortingUtilities.generateRandomArray(100, 0, 100);
        System.out.print("Generated array: ");
        for(int number : intArray3){
            System.out.print(number + ", ");
        }
        System.out.print(System.lineSeparator());
        Arrays.sort(intArray3);
        if(SortingUtilities.detectAdjacentInversions(intArray3)){
            System.out.println("Detected inversions: this array is NOT sorted.");
        }else{
            System.out.println("Detected 0 inversions in the array.");
        }
        System.out.print("Sorted array: ");
        for(int number : intArray3){
            System.out.print(number + ", ");
        }
        System.out.print(System.lineSeparator());

        int[] targets = {-5, 0, 12, 13, 14, 25, 79, 100, 101};
        for (int i = 0; i < targets.length; i++) {
            int indexofTarget = JumpSearch.search(intArray3, targets[i]);
            System.out.println("Element " + targets[i] + " found at index: " + indexofTarget);
        }

        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());


    }
}