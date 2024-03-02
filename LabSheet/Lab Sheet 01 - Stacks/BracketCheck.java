package lab_sheet_01;

public class BracketCheck {
	private String inputStr;
	
	public BracketCheck(String in) {
		inputStr = in;
	}
	
	public void checkBracket() {
		int size = inputStr.length();
		Stack bracketStack = new Stack(size);
		
		for(int i = 0; i < size; i++) {
			if(inputStr.charAt(i) == '(') {
				bracketStack.push('(');
			} else if (inputStr.charAt(i) == ')'){
				bracketStack.pop();
			}
		}
		
		if(!bracketStack.isEmpty()) {
			System.out.println("Invalid String!");
		} else {
			System.out.println("Valid String!");
		}
		
	}
}
