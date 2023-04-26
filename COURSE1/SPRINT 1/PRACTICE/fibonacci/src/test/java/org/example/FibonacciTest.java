package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class FibonacciTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FibonacciTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FibonacciTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFibonacciSuccess()
    {
        PrintStream printStreamOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        Fibonacci.generateFibonnaci(10);
        String c = "";
        try {
            c = byteArrayOutputStream.toString("UTF-8");
        }
        catch (Exception e){}
        System.setOut(printStreamOut);
        assertEquals(c, "1 1 2 3 5 8 13 21 34 55 ");
    }

    public void testFibonacciFail()
    {
        PrintStream printStreamOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        Fibonacci.generateFibonnaci(10);
        String c = "";
        try {
            c = byteArrayOutputStream.toString("UTF-8");
        }
        catch (Exception e){}
        System.setOut(printStreamOut);
        assertEquals(c, "1 1 2 3 5 8 13 21 34 ");
    }
}
