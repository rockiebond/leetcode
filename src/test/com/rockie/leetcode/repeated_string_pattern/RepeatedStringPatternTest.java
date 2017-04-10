package test.com.rockie.leetcode.repeated_string_pattern;

import com.rockie.leetcode.repeated_string_pattern.RepeatedStringPattern;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * RepeatedStringPattern Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 5, 2017</pre>
 */
public class RepeatedStringPatternTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: repeatedSubstringPattern(String s)
     */
    @Test
    public void testRepeatedSubstringPattern() throws Exception {
        RepeatedStringPattern rpt = new RepeatedStringPattern();
        assertEquals(true, rpt.repeatedSubstringPattern("abcabc"));
        String[] strs = {"abc", "abcd", "abca", "abce"};
        Arrays.sort(strs);
        for(String str :strs) {
            System.out.println(str);
        }
    }


} 
