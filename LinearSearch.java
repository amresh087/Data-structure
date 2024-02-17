package com.array.demo;
import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
		int n, arr[], item;
    int c = 0;
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

		for (int i = 0; i < arr.length; i++) {

			if (item == arr[i]) {
				c++;
				break;
			}

		}

		if (c > 0) {
			System.out.println("The item is founded :" + item);
		} else {
			System.out.println("The item is not founded :" + item);
		}

	}

}
