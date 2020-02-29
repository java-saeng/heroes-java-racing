package controller;

import org.junit.Test;

import javax.naming.InvalidNameException;

import static org.junit.Assert.*;

public class splitCarNamesTest {
    CarNamesSpliter splitCarNames = new CarNamesSpliter();

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void 다섯자가넘어갔을때_예외를_발생시킨다() throws InvalidNameException {
        splitCarNames.splitCarNames("a,ab,abc,abcdef");
    }

    @Test
    public void 다섯자_이하로_넣었을때_정상작동한다() throws InvalidNameException {
        String[] names = splitCarNames.splitCarNames("a,ab,abc,abcde");
        assertArrayEquals(names, new String[]{"a", "ab", "abc", "abcde"});
    }
}