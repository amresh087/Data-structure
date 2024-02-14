package com.array.demo;

public class CQueue {

	int size, front, rear, items[];

	public CQueue(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		items = new int[size];
	}

	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("The Queue is full");
		} else {
			if (front == -1)
				front = 0;

			rear = (rear + 1) % size;
			items[rear] = element;

			System.out.println("Inserted element " + element);

		}

	}

	public int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		} else {
			element = items[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return element;
		}
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		} else
			return false;
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		CQueue cq = new CQueue(5);
		// fail
		cq.deQueue();
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);
		cq.enQueue(300);

	}

}
