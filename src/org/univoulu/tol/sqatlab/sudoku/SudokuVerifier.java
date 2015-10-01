package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		if(!checkRow(candidateSolution)) {
			return -3;
		}
		return 1;
	}
	
	private Boolean checkRow(String candidateSolution) {
		
		for(int i = 0; i < 9; i++) {
			int beginIndex = i * 9;
			int endIndex = beginIndex + 9;
			String subString = candidateSolution.substring(beginIndex, endIndex);
			
			System.out.println("Checking substring " + subString);
			
			if( !checkSubString(subString) ) {
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
				
				System.out.println("Comparing " + digit + " to " + character);
				
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
