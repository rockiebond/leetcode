package test.com.rockie.leetcode.atoi;

import com.rockie.leetcode.atoi.Atoi;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/**
 * Atoi Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 6, 2017</pre>
 */
public class AtoiTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: myAtoi(String str)
     */
    @Test
    public void testMyAtoi() throws Exception {
        Atoi atoi = new Atoi();
        assertEquals(1, atoi.myAtoi("1"));
        assertEquals(1, atoi.myAtoi("+1"));
        assertEquals(1, atoi.myAtoi("1aaa"));
        assertEquals(-1, atoi.myAtoi("-1"));
    }


} 
