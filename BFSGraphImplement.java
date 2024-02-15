package com.array.demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSGraphImplement {
	// create a array that can take LinkedList<Integer> type data
	LinkedList<Integer> adjacency[];

	public BFSGraphImplement(int v) {
		adjacency = new LinkedList[v];
		// base one vertex nubmer array will be assign
		for (int i = 0; i < v; i++) {
			adjacency[i] = new LinkedList<Integer>();
		}

	}

	public void insertedge(int s, int d) {
		// here a array for storing vertex and adjacent store in LinkedList

		adjacency[s].add(d);
		adjacency[d].add(s);

		System.out.print(adjacency[d]);
		System.out.println(adjacency[s]);

	}

	public void bfs(int source) {
		boolean visited_nodes[] = new boolean[adjacency.length];
		int parent_nodes[] = new int[adjacency.length];

		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		visited_nodes[source] = true;
		parent_nodes[source] = -1;

		while (!q.isEmpty()) {
			// next time p become parent becuase you are poll
			int p = q.poll();
			System.out.print(p+" ");

			// adding adjcent in queue
			for (int i : adjacency[p]) {
				if (visited_nodes[i] != true) {
					visited_nodes[i] = true;
					q.add(i);
					parent_nodes[i] = p;
				}

			}

		}

	}

	public static void main(String[] args) {
		/*
		 * |0-------------------1 | | | | |2-------------------3
		 * 
		 * Enter number vertices 4 Enter number Edges 3 Enter source Edge 0 Enter
		 * destination Edge 1 [0][1] Enter source Edge 0 Enter destination Edge 2 [0][1,
		 * 2] Enter source Edge 2 Enter destination Edge 3 [2][0, 3]
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number vertices ");
		int v = sc.nextInt();
		System.out.print("Enter number Edges ");
		int e = sc.nextInt();
		BFSGraphImplement graph = new BFSGraphImplement(v);

		// For Every edge we entering source vertex and destination vertex for edge
		for (int i = 0; i < e; i++) {
			System.out.print("Enter source Edge ");
			int s = sc.nextInt();
			System.out.print("Enter destination Edge ");
			int d = sc.nextInt();

			graph.insertedge(s, d);

		}
		/*
		 * //only for showing data present in array for(int
		 * i=0;i<graph.adjacency.length;i++) { LinkedList<Integer> p=graph.adjacency[i];
		 * System.out.println("array index "+i+" containing LinkedList---> "+String.
		 * valueOf(p)); }
		 */

		System.out.println("Enter the source for bfs traversal ");
		int source = sc.nextInt();
		graph.bfs(source);

	}

}
