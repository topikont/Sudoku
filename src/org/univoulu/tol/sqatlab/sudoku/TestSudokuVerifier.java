package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	private SudokuVerifier verifier;
	private static final String CORRECT_STRING = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	private static final String INCORRECT_STRING = "117369825632158947958724316825437169791586432346912758289643571573291684164875293";
	
	private static final String SHORT_STRING = "117369825632158947958724316825437";
	private static final String LONG_STRING = "117369825632158947958724316825437169791586432346912758289643571573291684164875293123123";
	
	@Before
	public void init() {
		verifier = new SudokuVerifier();
	}
	
	@Test
	public void testCorrectSudokuString() {
		int result = verifier.verify(CORRECT_STRING);
		
		assertEquals(1, result);
	}
	
	@Test
	public void testIncorrectSudokuString() {
		int result = verifier.verify(INCORRECT_STRING);
		
		assertEquals(-3, result);
	}
	
	@Test
	public void testTooShortString() {
		int result = verifier.verify(SHORT_STRING);
		
		assertEquals(SudokuVerifier.RESULT_INCORRECT_STRING_TOO_SHORT, result);
	}
	
	@Test
	public void testTooLongString() {
		int result = verifier.verify(LONG_STRING)
	}
}
