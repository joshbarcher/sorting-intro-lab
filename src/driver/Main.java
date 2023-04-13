package driver;

import sorts.Sorts;
import utility.SortingUtilities;

public class Main
{
    public static void main(String[] args)
    {
        int[] intArray = SortingUtilities.generateRandomArray(20, 0, 50);
        Sorts sorter = new Sorts();
        sorter.selectionSort(intArray);
        if(SortingUtilities.detectAdjacentInversions(intArray)){
            System.out.println("Detected inversions: this array is NOT sorted.");
        }else{
            System.out.println("Detected 0 inversions in the array.");
        }

    }
}