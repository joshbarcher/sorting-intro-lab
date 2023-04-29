package searches;

/**
 * Provides a static method for searching a sorted array of ints
 *
 * @author Adam Winter
 * @version see SCR
 */

public class JumpSearch {

    public static int search(int[] array, int target){
        int rootN = (int) Math.round(Math.sqrt(array.length));
        for (int i = 0; i < array.length; i+=rootN) {
            if(target < array[0]){
                return -1;
            }else if(target > array[array.length -1]){
                return -1;
            }else if(array[i] == target){
                return i;
            }else if(array[i] > target){
                return eachBackwards(array, target, i, rootN);
            }else if(i+rootN >= array.length){
                return eachBackwards(array, target, array.length - 1, array.length - i);
            }else{
                //nothing
            }
        }
        return -1;
    }

    private static int eachBackwards(int[] array, int target, int start, int subLength){
        for (int i = start; i > start - subLength - 1; i--) {
            if(array[i] == target){return i;}
        }
        return -1;
    }
}
