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
			
			
		}
		
		return true;
	}
	
	private Boolean checkSubString(String subString) {
		//subString.
		
		for(int i = 0; i < 9; i++) {
			
		}
		
		return true;
	}
}
