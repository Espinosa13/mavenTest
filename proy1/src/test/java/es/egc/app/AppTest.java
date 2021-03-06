package es.egc.app;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Iterator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * @return the suite of tests being tested
     */
    public void getVal()
    {
        assertTrue(App.getVal()==1);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void testMockito(){
     //arrange
     Iterator i=mock(Iterator.class);
     when(i.next()).thenReturn("Hello").thenReturn("World");
     //act
     String result=i.next()+" "+i.next();
     
     //assert
     assertEquals("Hello World", result);
    }

	
}
