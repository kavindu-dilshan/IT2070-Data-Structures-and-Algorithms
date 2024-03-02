package lab_sheet_01;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	public void push(char c) {
		if(!isFull()) {
			stackArray[++top] = c;
		} else {
			System.out.println("Stack is full!");
		}
	}
	
	public char pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		} else {
			System.out.println("Stack is empty!");
		}
		return 0;
	}
	
	public char peek() {
		if(!isEmpty()) {
			return stackArray[top];
		} else {
			System.out.println("Stack is empty!");
		}
		return 0;
	}
	
	public void display() {
		System.out.println("Printing Stack Elements");
		System.out.println(".......................");
		
		int i = top;
		
		while (i>=0) {
			System.out.print(stackArray[i]);
			i--;
		}
	}
}
