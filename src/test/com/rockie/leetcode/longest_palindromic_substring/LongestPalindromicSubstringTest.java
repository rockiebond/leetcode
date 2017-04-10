package test.com.rockie.leetcode.longest_palindromic_substring;

import com.rockie.leetcode.longest_palindromic_substring.LongestPalindromicSubstring;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/**
 * LongestPalindromicSubstring Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 5, 2017</pre>
 */
public class LongestPalindromicSubstringTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: longestPalindrome(String s)
     */
    @Test
    public void testLongestPalindrome() throws Exception {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        assertEquals("bab", solution.longestPalindrome("babad"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
        assertEquals("a", solution.longestPalindrome("a"));
        assertEquals("aa", solution.longestPalindrome("aa"));
    }

    /**
     * Method: isSymmetric(String s)
     */
    @Test
    public void testIsSymmetric() throws Exception {
//TODO: Test goes here... 
    }


} 
