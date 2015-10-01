package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public static final int RESULT_CORRECT = 0;
	public static final int RESULT_INCORRECT_RULE_1 = -1;
	public static final int RESULT_INCORRECT_RULE_2 = -2;
	public static final int RESULT_INCORRECT_RULE_3 = -3;
	public static final int RESULT_INCORRECT_RULE_4 = -4;
	public static final int RESULT_INCORRECT_STRING_TOO_SHORT = -5;
	
	public int verify(String candidateSolution) {
		if(!checkRow(candidateSolution)) {
			return -3;
		} else if( !checkColumn(candidateSolution) ) {
			return -4;
		}
		return 1;
	}
	
	private Boolean checkRow(String candidateSolution) {
		
		for(int i = 0; i < 9; i++) {
			int beginIndex = i * 9;
			int endIndex = beginIndex + 9;
			String subString = candidateSolution.substring(beginIndex, endIndex);
			
			if( !checkSubString(subString) ) {
				return false;
			}
		}
		
		return true;
	}
	
	private Boolean checkColumn(String candidateSolution) {
		
		for(int i = 0; i < 9; i++) {
			String subString = "";
			
			for(int k = 0; k < 9; k++) {
				subString = subString + candidateSolution.charAt(k*9);
			}
			
			if(!checkSubString(subString)) {
				return false;
			}
		}
		
		return true;
	}
	
	private Boolean checkSubString(String subString) {
		
		for(int i = 0; i < 9; i++) {
			int count = 0;
			
			for(int k = 0; k < 9; k++) {
				
				String digit = String.valueOf(i+1);
				
				String character = String.valueOf(subString.charAt(k));
				
				if( character.equals(digit)  ) {
					count++;
				}
			}
			
			if(count != 1) {
				return false;
			}
		}
		
		return true;
	}
}
