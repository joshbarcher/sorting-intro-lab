package sorts;

public class MergeSort {
    int[] temp;

    public void iMergeSort(int[] array){
        if(array.length == 0 || array.length == 1){
            return; // already sorted
        }
        temp = new int[array.length];
        iMergeSort(array, 0, array.length - 1);
    }

    private void iMergeSort(int[] array, int low, int high){
        //pair up sub-arrays...
        for (int size = 1; size <= array.length -1; size *= 2) {
            for(int left = 0; left < array.length -1; left += 2 * size){
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size -1, array.length - 1);
                iMerge(array, left, mid, right);
            }
        }
    }

    private void iMerge(int[] array, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        int count = high - low + 1;

        for(int i = 0; i < count; i++){
            if (left > mid){
                temp[low + i] = array[right++];
            }
            else if (right > high){
                temp[low + i] = array[left++];
            }
            else if (array[left] < array[right]){
                temp[low + i] = array[left++];
            }
            else{
                temp[low + i] = array[right++];
            }
        }

        for (int i = 0; i < count; i++){
            array[low + i] = temp[low + i];
        }
    }


}
