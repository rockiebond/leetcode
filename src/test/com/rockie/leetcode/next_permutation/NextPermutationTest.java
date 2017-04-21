package test.com.rockie.leetcode.next_permutation;

import com.rockie.leetcode.next_permutation.NextPermutation;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;

/**
 * NextPermutation Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 20, 2017</pre>
 */
public class NextPermutationTest {
    NextPermutation nextPermutation = new NextPermutation();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: nextPermutation(int[] nums)
     */
    @Test
    public void testNextPermutation() throws Exception {
        int[] nums = new int[]{1,3,2};
        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Method: swap(int[] nums, int i, int j)
     */
    @Test
    public void testSwap() throws Exception {
    }


} 
