package algorithm;

import org.testng.Assert;

public class UnitTestSorting {


    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        Sort sort = new Sort();

        sort.selectionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array Unsorted");
        }catch(Exception ex){
            ex.getMessage();
        }
                                                                        //BubbleSort
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array Unsorted");
        }catch(Exception ex){
            ex.getMessage();
        }

                                                                        //InsertionSort
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array Unsorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        /*//merge sort
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.mergeSort(unSortedArray,0,unSortedArray.length-1);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        //quick sort
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.quickSort(unSortedArray,0,unSortedArray.length-1);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        //heap sort
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.heapSort(unSortedArray,unSortedArray.length);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        //bucket sort
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.bucketSort(unSortedArray,9);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }*/


    }
}