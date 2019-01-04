package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		int [] num = new int[1000000];
		storeRandomNumbers(num);
//	ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//	connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
//	List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
//	printValue(numbers);
		Sort algorithm = new Sort();
		int n = num.length;
		//**** Selection Sort ****
		algorithm.selectionSort(num);
		long selectionSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " Numbers in Selection Sort: " + selectionSortExecutionTime + " milli sec");

		//**** Insertion Sort ****
		randomize (num, n);
		algorithm.insertionSort(num);
		long insertionSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Insertion Sort: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm....
		//Come to conclusion about which Sorting Algo is better in given data set.

		//**** bubble sort ****
		randomize (num, n);
		algorithm.bubbleSort(num);
		long bubbleSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Bubble Sort: " + bubbleSortExecutionTime + " milli sec");

		//**** merge sort ****
		randomize (num, n);
		algorithm.mergeSort(num,0,n-1);
		long mergeSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Merge Sort: " + mergeSortExecutionTime + " milli sec");

		//**** quick sort ****
		randomize (num, n);
		algorithm.quickSort(num,0,n-1);
		long quickSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Quick Sort: " + quickSortExecutionTime + " milli sec");

		//**** heap sort ****
		randomize (num, n);
		algorithm.heapSort(num,n);
		int maxValueForBucketSort = num[num.length-1];
		long heapSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Heap Sort: " + heapSortExecutionTime + " milli sec");

		//**** bucket sort ****
		randomize (num, n);
		algorithm.bucketSort(num,maxValueForBucketSort);
		long bucketSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}
	public static void randomize( int arr[], int n) {
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}