package com.bondarenkojek;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class BracketsCheckerTest {
    private BracketsChecker checker;

    @Before
    public void setUp() throws Exception {
        checker = new BracketsChecker();
    }

    @Test
    public void checkBracketsTest1CaseOk() throws Exception {
        String testData = "hello";
        assertTrue(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest2CaseOk() throws Exception {
        String testData = "(hello)";
        assertTrue(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest3CaseOk() throws Exception {
        String testData = "(())";
        assertTrue(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest4CaseOk() throws Exception {
        String testData = "()()";
        assertTrue(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest5CaseOk() throws Exception {
        String testData = "((()()))";
        assertTrue(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest6CaseOk() throws Exception {
        String testData = "()";
        assertTrue(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest1CaseNoOk() throws Exception {
        String testData = "(";
        assertFalse(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest2CaseNoOk() throws Exception {
        String testData = ")";
        assertFalse(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest3CaseNoOk() throws Exception {
        String testData = "())";
        assertFalse(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest4CaseNoOk() throws Exception {
        String testData = ")(";
        assertFalse(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTest5CaseNoOk() throws Exception {
        String testData = "()()((";
        assertFalse(checker.checkBrackets(testData));
    }

    @Test
    public void checkBracketsTestCaseNull() throws Exception {
        String testData = null;
        assertFalse(checker.checkBrackets(testData));
    }
}