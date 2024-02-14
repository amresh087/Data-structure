package com.array.demo;

public class Queue {
	
	int SIZE;
	int item[];
	int rear, front;
	
	public Queue(int size) {
		this.SIZE=size;
		item=new int[size];
		front=-1;
		rear=-1;
	}
	
	
	public boolean isFull() {
		if(front==0 && rear==SIZE-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean isEmpty() {
		if(front==-1)
			return true;
		else
			return false;
	}
	
	public void enQueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(front==-1)
				front=0;
			rear++;
			item[rear]=element;
		}
	}
	
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			int element=item[front];
			if(front>=rear) {
				front=-1;
				rear=-1;
			}else {
				front++;
			}
			
			return element;
		}
		
	}
	
	
	public void display() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
		}else {
			for(int i=front; i<rear;i++) {
				System.out.print(item[i]+" ");
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue(5);

	    // deQueue is not possible on empty queue
	    q.deQueue();

	    // enQueue 5 elements
	    q.enQueue(1);
	    q.enQueue(2);
	    q.enQueue(3);
	    q.enQueue(4);
	    q.enQueue(5);

	    // 6th element can't be added to because the queue is full
	    q.enQueue(6);

	    q.display();

	    // deQueue removes element entered first i.e. 1
	    q.deQueue();

	    // Now we have just 4 elements
	    q.display();

	}

}
