package org.stackroute;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculatorTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculatorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd(){
        assertEquals(10.0, new Calculator().add(5.2, 4.8));
    }

    public void testSubtract(){
        assertEquals(10.0, new Calculator().subtract(20, 10));
    }

    public void testMultiply(){
        assertEquals(10.0, new Calculator().multiply(2, 5));
    }

    public void testDivide(){
        assertEquals(2.0, new Calculator().divide(100, 10));
        assertEquals(Double.POSITIVE_INFINITY, new Calculator().divide(10, 0));
    }
}
