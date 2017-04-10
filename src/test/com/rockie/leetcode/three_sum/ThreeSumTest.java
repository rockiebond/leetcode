package test.com.rockie.leetcode.three_sum;

import com.rockie.leetcode.three_sum.ThreeSum;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
 * ThreeSum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 6, 2017</pre>
 */
public class ThreeSumTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: threeSum(int[] sums)
     */
    @Test
    public void testThreeSum() throws Exception {
        ThreeSum obj = new ThreeSum();
        int[] sums = {-3,-4,-2,0,2,2,-2,1,-1,2,3,-1,-5,-4,-5,1};
        List<List<Integer>> result = obj.threeSum(sums);
        System.out.println(result.toString());
    }


} 
