package lab_sheet_01;

public class BracketApp {

	public static void main(String[] args) {
		
		BracketCheck bc1 = new BracketCheck("3 + (( 6 * 2) – 3)");
		bc1.checkBracket();
		
		BracketCheck bc2 = new BracketCheck("5 * 6 + (2 - 5");
		bc2.checkBracket();
	}

}
