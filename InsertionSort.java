package com.array.demo;

import java.util.Scanner;

public class InsertionSort {

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

		InsertionSort is = new InsertionSort();
		// bubble sort
		is.insertionSort(arr, n);
		// print
		is.printData(arr, n);
	}

	public void insertionSort(int arr[], int n) {

		int  temp, i,j;

		for (i = 1; i <=n - 1; i++) {// this loop is starting from 1 index
			//first index value put in temp
			temp=arr[i];
			j=i-1;
			while(j>-1 && temp<arr[j] ) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}

	}

	public void printData(int arr[], int n) {

		System.out.println("print sorted data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}

