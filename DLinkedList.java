package com.array.demo;
import java.util.Scanner;

public class DLinkedList {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev=prev;
		}
	}

	Node head = null;
	Node tail = null;

	public void creation() {
		int data, n, m;

		do {
			System.out.print("Enter the data: ");
			Scanner sc = new Scanner(System.in);
			data = sc.nextInt();
			Node new_node = new Node(data);
			
			Node temp = head;
			Node ptr=temp.next;

			if (head == null) {
				// LinkedList is not exist
				// then assigning new_node address to head
				head = new_node;
				tail=new_node;
			} else {

				System.out.print(
						"Enter 2 for insert item at beginning, 3 for insert at end, 4 for insert at specific postion :");
				m = sc.nextInt();

				switch (m) {
				case 2:
					// Here we are inserting new_node at begning
					// LinkedList is exist
					// first we are store old head addreess into new_node address section
					new_node.next = head;
					// now assign new_node address into head
					head = new_node;
					// mean existing node prev addess store new node
					head.prev=new_node; 
					break;

				case 3:
					// we are using here tail then we are putting new_node on tail next
					tail.next=new_node;
					new_node.prev=tail;
					tail=new_node;
					break;
				case 4:
					System.out.print("Eter the postion for insert element: ");
					int p = sc.nextInt();
					// Here we are using temp pointer going up to postion pointer
					// then inserting new node
					for (int i = 1; i < p - 1; i++) {
						temp = ptr;
						ptr=ptr.next;
					}
					new_node.prev=temp;
					// assining new_node address to old adress
					new_node.next = ptr;
					// now
					temp.next = new_node;
					ptr.prev=new_node;
					break;

				}

			}

			System.out.print("do you want to add more data. If yes press: 1 ");
			n = sc.nextInt();
		} while (n == 1);

	}

	/**
	 * 
	 */
	public void deletion() {
		int m, n;
		Scanner sc = new Scanner(System.in);

		do {

			if (head == null) {
				System.out.print("LinkedLis is empty: ");
			} else {
				System.out.print(
						"Enter 2 for delete item at beginning, 3 for delete at end, 4 for delete at specific postion :");
				m = sc.nextInt();
				switch (m) {

				case 2:
					// here we are creating temp pointer storing head
					Node temp = head;
					// now in temp putting second element address
					temp = temp.next;
					// now placing second node address in head then first node automatic delete
					head = temp;
					head.prev=null;
					break;

				case 3:
					Node temp1 = tail;
					temp1=temp1.prev;
					temp1.next=null;
					break;

				case 4:
					// Here I am creating two pointer becuase
					// we are going to delete postion node
					// when I will reach node node then we need last prev node details
					// here ptr1 is going to delete
					System.out.print(" Enter the postion :");
					int p = sc.nextInt();
					Node temp2 = head;
					Node ptr1 = temp2.next;

					for (int i = 1; i < p - 1; i++) {
						temp2 = ptr1;
						ptr1 = ptr1.next;
					}

					temp2.next = ptr1.next;
					// mean you are two pointer temp, ptr here ptr is going to delete
					// so ptr.next.pre address will be temp
					ptr1.next.prev=temp2;

					break;

				}
			}

			System.out.print("Do you want delete more element. If yes press 1 : ");
			n = sc.nextInt();
		} while (n == 1);

	}

	/**
	 * 
	 */
	public void traverse() {
		Node temp = head;
		if (head == null) {
			System.out.print("LinkedList is empty :");
		} else {

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}

	}

	public static void main(String[] args) {
		SLinkedList sll = new SLinkedList();
		sll.creation();
		sll.deletion();

		sll.traverse();

	}

}

