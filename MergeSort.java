package com.array.demo;
import java.util.Scanner;

public class MergeSort {

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

		MergeSort ms = new MergeSort();
		ms.mergeSort(arr,0,n-1);
		
		// print
		ms.printData(arr, n);
	}

	public void mergeSort(int arr[], int start, int end) {
		
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort( arr,start,mid);
			mergeSort( arr,mid+1,end);
			merge(arr,start,mid,end);
		}

		
	}
	
	public void merge(int arr[],int start,int mid,int end) {
		// think when it reach last recusive then start=0 and end=0
		// l=0-0+1
		int l = mid - start + 1; 
		int r = end - mid;
		
		int left_subarray[]=new int[l];
		int right_subarray[]=new int[r];
		
		for(int i=0;i<l;++i) 
			left_subarray[i]=arr[start+i];
		
		
		for(int j=0;j<r;++j)
			right_subarray[j]=arr[mid+1+j];
		
		
		
		int i=0,j=0;
		int k=start;
		while(i<l  && j<r)
		{
			if(left_subarray[i]<=right_subarray[j]) {
				arr[k]=left_subarray[i];
				i++;
			}else {
				arr[k]=right_subarray[j];
				j++;
			}
			k++;
			
		}
		
		
		while(i<l) {
			arr[k]=left_subarray[i];
			i++;
			k++;
		}
		
		while(j<r) {
			arr[k]=right_subarray[j];
			j++;
			k++;
		}
		
		
	}

	public void printData(int arr[], int n) {

		System.out.println("print sorted data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
