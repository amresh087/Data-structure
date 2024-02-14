package com.array.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {

	static class Node {

		// storing character in ch variable of type character
		Character ch;
		// storing frequency in freq variable of type int
		Integer freq;
		Node left;
		Node right;

		Node(Character ch, Integer freq) {
			this.ch = ch;
			this.freq = freq;
		}

		Node(Character ch, Integer freq, Node left, Node right) {
			this.ch = ch;
			this.freq = freq;
			this.left = left;
			this.right = right;
		}

	}

	public static Node createHuffmanTree(String text) {

		if (text == null || text.length() == 0)
			return null;

		// count the freq for each charector
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : text.toCharArray()) {
			// getOrDefault(c, 0) when calling this method then take two param
			// first param take as key and second is default value becuase if
			// key is not exist then return defualt value
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		// create a priority queue that stores current nodes of the Huffman tree.
		// here a point to note that the highest priority means the lowest frequency
		PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.freq));

		// loop iterate over the Map and returns a Set view of the mappings contained in
		// this Map
		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			// creates a leaf node and add it to the queue
			pq.add(new Node(entry.getKey(), entry.getValue()));
		}

		// while loop runs until there is more than one node in the queue
		while (pq.size() != 1) {
			// removing the nodes having the highest priority (the lowest frequency) from
			// the queue
			Node left = pq.poll();
			Node right = pq.poll();

			// create a new internal node with these two nodes as children
			// and with a frequency equal to the sum of both nodes' frequencies.
			// Add the new node to the priority queue.
			// sum up the frequency of the nodes (left and right) that we have deleted
			int sum = left.freq + right.freq;
			// adding a new internal node (deleted nodes i.e. right and left)
			// to the queue with a frequency that is equal to the sum of both nodes
			pq.add(new Node(null, sum, left, right));

		}
		// root stores pointer to the root of Huffman Tree
		Node root = pq.peek();

		return root;

	}

	// traverse the Huffman Tree and store Huffman Codes in a Map
	// function that encodes the data
	public static void encodeData(Node root, String str, Map<Character, String> huffmanCode) {
		if (root == null) {
			return;
		}

		// checks if the node is a leaf node or not
		if (isLeaf(root)) {
			huffmanCode.put(root.ch, str.length() > 0 ? str : "1");
		}
		encodeData(root.left, str + '0', huffmanCode);
		encodeData(root.right, str + '1', huffmanCode);

	}

	// function to check if the Huffman Tree contains a single node
	public static boolean isLeaf(Node root) {
		// returns true if both conditions return ture
		return root.left == null && root.right == null;
	}

	public static int decodeData(Node root, int index, StringBuilder sb) {
		// checks if the root node is null or not
		if (root == null) {
			return index;
		}
		// checks if the node is a leaf node or not
		if (isLeaf(root)) {
			System.out.print(root.ch);
			return index;
		}
		index++;
		root = (sb.charAt(index) == '0') ? root.left : root.right;
		index = decodeData(root, index, sb);
		return index;
	}

	public static void main(String[] args) {
		String text = "amresh verma pratapgarh uatter pradesh";

		Huffman hman = new Huffman();
		Node root = hman.createHuffmanTree(text);

		Map<Character, String> huffmanCode = new HashMap<>();
		encodeData(root, "", huffmanCode);
		// print the Huffman codes for the characters
		System.out.println("Huffman Codes of the characters are: " + huffmanCode);
		// prints the initial data
		System.out.println("The initial string is: " + text);

		// creating an instance of the StringBuilder class
		StringBuilder sb = new StringBuilder();
		// loop iterate over the character array
		for (char c : text.toCharArray()) {
			// prints encoded string by getting characters
			sb.append(huffmanCode.get(c));
		}
		System.out.println("The encoded string is: " + sb);

		// ====================

		System.out.print("The decoded string is: ");
		if (isLeaf(root)) {
			while (root.freq-- > 0) {
				System.out.print(root.ch);
			}
		} else {
			// traverse over the Huffman tree again and this time, decode the encoded string
			int index = -1;
			while (index < sb.length() - 1) {
				index = decodeData(root, index, sb);
			}

		}

	}

}
