package com.array.demo;

import java.util.Scanner;

public class SelectionSort {

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

		SelectionSort bs = new SelectionSort();
		// bubble sort
		bs.selectionSort(arr, n);
		// print
		bs.printData(arr, n);
	}

	public void selectionSort(int arr[], int n) {

		int loc, temp;

		for (int i = 0; i < n - 1; i++) {// this loop is using these element for swap

			loc = i;
			for (int j = i + 1; j < n; j++) { // this loop is use for finding minimun element from unsorted array
				if (arr[j] < arr[loc]) { // get minimum element from unsorted array
					loc = j;
				}

			}
			// System.out.println("============"+loc);

			// swap logic
			temp = arr[i];
			arr[i] = arr[loc];
			arr[loc] = temp;

		}

	}

	public void printData(int arr[], int n) {

		System.out.println("print sorted data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
