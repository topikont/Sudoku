package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	private SudokuVerifier verifier;
	private static final CORRECT_STRING = 
	
	@Before
	public void init() {
		verifier = new SudokuVerifier();
	}
	
	
	@Test
	public void testCorrectSudokuString() {
		verifier.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
	}
}
