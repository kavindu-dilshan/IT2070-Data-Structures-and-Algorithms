package lab_sheet_01;

public class StackApp {
	
	public static void main(String[] args) {
		Stack myStack = new Stack(5);
		
		myStack.push('T');
		myStack.push('I');
		myStack.push('I');
		myStack.push('L');
		myStack.push('S');
		
		myStack.display();
		
		System.out.println("\n");
		System.out.println("Peek Value: " + myStack.peek());
		System.out.println("");
		
		int i = 1;
		
		while (!myStack.isEmpty()) {
			char c = myStack.pop();
			System.out.println("Top Value "+(i)+" Deleted: "+c);
			i++;
		}
	}
}
