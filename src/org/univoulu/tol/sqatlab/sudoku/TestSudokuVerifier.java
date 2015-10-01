package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	private SudokuVerifier verifier;
	private static final String CORRECT_STRING = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	
	@Before
	public void init() {
		verifier = new SudokuVerifier();
	}
	
	@Test
	public void testCorrectSudokuString() {
		int result = verifier.verify(CORRECT_STRING);
		
		assertEquals(1, result);
	}
}
