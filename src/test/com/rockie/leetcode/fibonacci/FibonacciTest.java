package test.com.rockie.leetcode.fibonacci;

import com.rockie.leetcode.fibonacci.Fibonacci;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/**
 * Fibonacci Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 14, 2017</pre>
 */
public class FibonacciTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: fibonacciNaive(int n)
     */
    @Test
    public void testFibonacciNaive() throws Exception {
        Fibonacci obj = new Fibonacci();
        assertEquals(2,obj.fibonacciNaive(3));

        long startTime = System.nanoTime();
        int result = obj.fibonacciNaive(10);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Time of fibonacciNaive :" + duration);
    }

    /**
     * Method: fibonacci(int n)
     */
    @Test
    public void testFibonacci() throws Exception {
        Fibonacci obj = new Fibonacci();
        assertEquals(2,obj.fibonacci(3));
        long startTime = System.nanoTime();
        int result = obj.fibonacci(10);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Time of fibonacci:" + duration);
    }
}
