package com.array.demo;

import java.util.Scanner;

public class BinaryTreeInOrder {
	
	static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
			
		}
	
	
	public static Node createNode() {
		
		Node root=null;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value (-1 for stop) ");
		int data=sc.nextInt();
		
		if(data==-1)
			return null;
		root=new Node(data);
		
		System.out.print("left child of the "+root.data+" ");
		root.left=createNode();
		
		System.out.print("right child of the "+root.data+" ");
		root.right=createNode();
		
		
		return root;	
	}
	
	static void printInOrder(Node node) {
		//InOrder Traversal(left→root→right)
		if(node==null)
			return;
		
		printInOrder(node.left);
		System.out.print(" "+node.data);
		printInOrder(node.right);
		
	}
	
	
	static void printPreOrder(Node node) {
		//PreOrder Traversal(root →left → right)
		if(node==null)
			return;
		
		System.out.print(" "+node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
		
	}

	static void printPostOrder(Node node) {
		//PostOrder Traversal(left → right→root)
		if(node==null)
			return;
		
		
		printPreOrder(node.left);
		printPreOrder(node.right);
		System.out.print(" "+node.data);
		
	}
	public static void main(String[] args) {
		
		Node root=createNode();
		System.out.print("InOrder(left→root→right)---------------->>");
		printInOrder(root);
		System.out.print("	PreOrder(root →left → right)--------------->>");
		printPreOrder( root);
		System.out.print("	PostOrder(left → right→root)-------------->>");
		printPostOrder( root);
	}

}

	
}
