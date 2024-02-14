package com.array.demo;

public class Stack {
	
	private int arr[];
	private int top;
	private int capacity;
	
	public Stack(int size) {
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	
	
	public boolean isFull() {
		return top==capacity-1;//becuase top is starting from -1
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			System.exit(1);
		}
		arr[++top]=x;
		
	}
	
	public boolean isEmpty() {
		return top==-1;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return arr[top--];
	}
	
	
	public void printStack() {
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	
	

	public static void main(String[] args) {
		Stack stack=new Stack(5);
		   stack.push(1);
		   stack.push(2);
		   stack.push(3);
		   stack.push(4);
		   stack.push(5);
		   
		   
		   stack. printStack();
		   
		  int p= stack.pop();
		  System.out.println("pop "+p);
		  
		  stack. printStack();
		  

	}

}
