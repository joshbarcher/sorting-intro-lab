package sorts;

import utility.SortingUtilities;

public class Sorts
{
    public void selectionSort(int[] array)
    {
        int indexOfMin;
        for(int i =0; i < array.length; i++){
            indexOfMin = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < array[indexOfMin]){
                    indexOfMin = j;
                }
            }
            SortingUtilities.swap(array, i, indexOfMin);
        }
    }


    public void insertionSort(int[] array)
    {

    }
}
