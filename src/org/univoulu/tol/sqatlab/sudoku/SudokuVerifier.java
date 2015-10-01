package org.univoulu.tol.sqatlab.sudoku;

import com.sun.xml.internal.ws.util.StringUtils;

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
			int count = 0;
			for(int k = 0; i < 9; i++) {
				if(subString.charAt(k)equals(i)) {
					
				}
			}
		}
		
		return true;
	}
}
