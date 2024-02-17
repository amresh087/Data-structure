package com.array.demo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int n, arr[], item, beg, end, mid, c = 0;
		System.out.println("How many number you want enter ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the element ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("enter the item for search ");
		item = sc.nextInt();

		beg = 0;
		end = n - 1;
		while (end >= beg) {
			// beccuase we have taken mid as int then it will alway store floor value only
			mid = (beg + end) / 2;

			// now checking if item is found on mid
			if (item == arr[mid]) {
				System.out.println("The item is found at index " + mid);
				c++;
				break;
			} else if (item < arr[mid]) {
				end = mid - 1;
			} else if (item > arr[mid]) {
				beg = mid + 1;
			}
		}

		if (c == 0) {
			System.out.println("The item is not found");
		}

	}

}
