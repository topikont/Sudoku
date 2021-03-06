package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public static final int RESULT_CORRECT = 0;
	public static final int RESULT_INCORRECT_POSITIVE_DIGIT_PROBLEM = -1;
	public static final int RESULT_INCORRECT_SUBGRID_PROBLEM = -2;
	public static final int RESULT_INCORRECT_ROW_PROBLEM = -3;
	public static final int RESULT_INCORRECT_COLUMN_PROBLEM = -4;
	public static final int RESULT_INCORRECT_STRING_TOO_SHORT = -5;
	public static final int RESULT_INCORRECT_STRING_TOO_LONG = -6;
	
	public int verify(String candidateSolution) {
		if( candidateSolution.length() < 81) {
			return RESULT_INCORRECT_STRING_TOO_SHORT;
		} else if( candidateSolution.length() > 81) {
			return RESULT_INCORRECT_STRING_TOO_LONG;
		} else if( candidateSolution.contains("0")) {
			return RESULT_INCORRECT_POSITIVE_DIGIT_PROBLEM;
		} else if( !checkSubGrid(candidateSolution) ) {
			return RESULT_INCORRECT_SUBGRID_PROBLEM;
		} else if(!checkRows(candidateSolution)) {
			return RESULT_INCORRECT_ROW_PROBLEM;
		} else if( !checkColumns(candidateSolution) ) {
			return RESULT_INCORRECT_COLUMN_PROBLEM;
		}
		
		return RESULT_CORRECT;
	}
	
	private Boolean checkRows(String candidateSolution) {
		
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
	
	private Boolean checkColumns(String candidateSolution) {
		
		for(int i = 0; i < 9; i++) {
			String subString = "";
			
			for(int k = 0; k < 9; k++) {
				subString = subString + candidateSolution.charAt(i * 9 + k);
			}
			
			if(!checkSubString(subString)) {
				return false;
			}
		}
		
		return true;
	}
	
	private Boolean checkSubGrid(String candidateSolution) {
		
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 3; k++) {
				String subString = "";
				
				int beginIndex = i*27 + k*3;
				int endIndex = beginIndex  + 3;
				
				subString = subString + candidateSolution.substring(beginIndex, endIndex);
				subString = subString + candidateSolution.substring(beginIndex + 9, endIndex + 9);
				subString = subString + candidateSolution.substring(beginIndex + 18, endIndex + 18);
				
				if(!checkSubString(subString)) {
					return false;
				}
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
