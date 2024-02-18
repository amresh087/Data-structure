package com.array.demo;
import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {

		int n, arr[];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element ");
		n = sc.nextInt();
		arr = new int[n];

		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		QuickSort qs = new QuickSort();
		// 
		qs.quickSort(arr,0,n-1);
		// print
		qs.printData(arr, n);
	}
	
	public void quickSort(int arr[], int start, int end) {
		if(start<end) {
			int p=partition(arr,start,end);
			quickSort(arr,start, p-1);
			quickSort(arr, p+1,end);
		}
	}

	public int partition(int arr[], int start, int end) {
		
		//here we are taking pivot point end index, we can choose any index
		int pivot=arr[end];
		int pindex=start;
		
		for(int i=start;i<end-1;i++) {
			
			if(arr[i]<=pivot) {	
				//swap arr[i] to arr[pindex]
				int temp=arr[pindex];
				arr[pindex]=arr[i];
				arr[i]=temp;				
				pindex++;
				
			}
		}
		
		//now swap pindex value to pivot and pivot index value to pindex value		
		int temp=arr[pindex];
		//arr[pindex]=pivot or arr[pindex]=arr[end] 
		arr[pindex]=arr[end];
		arr[end]=temp;
		return pindex;
	}
	

	public void printData(int arr[], int n) {

		System.out.println("print sorted data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
