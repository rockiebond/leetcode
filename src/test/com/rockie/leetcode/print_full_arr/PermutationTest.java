package test.com.rockie.leetcode.print_full_arr;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
 * NumPrinter Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 20, 2017</pre>
 */
public class PermutationTest {

    protected Permutation perm;

    @Before
    public void before() throws Exception {
        perm = new Permutation();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: printNum(int[] nums, int start)
     */
    @Test
    public void testPrintNum() throws Exception {
        Permutation printer = new Permutation();
        int[] nums = {1,2,3};
        printer.printNum(nums, 0);
    }

    @Test
    public void testRecurPermutation() throws Exception {
        int[] nums = {1,2,3};
        Permutation printer = new Permutation();
        printer.perm(nums, 0);
    }

    @Test
    public void testPermDup() throws Exception {
        int[] nums = {2,2,1,1};
        List<List<Integer>> res = perm.permuteDup(nums);
        System.out.println(res.toString());
    }

    @Test
    public void testPermUnique() throws Exception {
        int[] nums = {2,2,1,1};
        List<List<Integer>> res = perm.permuteUnique(nums);
        System.out.println(res.toString());
    }


    /**
     * Method: swap(int[] nums, int start, int j)
     */
    @Test
    public void testSwap() throws Exception {
    }


} 
