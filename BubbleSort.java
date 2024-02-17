package com.array.demo;

import java.util.Scanner;

public class BubbleSort {

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

		BubbleSort bs = new BubbleSort();
		// bubble sort
		bs.bubblesort(arr, n);
		// print
		bs.printData(arr, n);
	}

	public void bubblesort(int arr[], int n) {

		for (int k = 0; k < n - 1; k++) {

			for (int j = 0; j < n - k - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public void printData(int arr[], int n) {

		System.out.println("print sorted data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
