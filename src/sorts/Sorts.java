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
        int size = array.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j >0; j--) {
                if(array[j]<array[j-1]){
                    int temp = array[j-1];   //wrote this in class.  So not using swap method from utilities
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }

    }
}
