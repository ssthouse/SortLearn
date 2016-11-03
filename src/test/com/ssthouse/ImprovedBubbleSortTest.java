package test.com.ssthouse;

import com.ssthouse.ImprovedBubbleSort;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;

/**
 * ImprovedBubbleSort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Nov 3, 2016</pre>
 */
public class ImprovedBubbleSortTest {

    private int[] testArray;
    private int[] expectResultArray;

    @Before
    public void before() throws Exception {
        testArray = new int[]{9, 1, 5, 8, 3, 7, 4, 6, 2};
        expectResultArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    /**
     * Method: sort(int[] numArray)
     */
    @Test
    public void testSort() throws Exception {
        assertArrayEquals(expectResultArray, new ImprovedBubbleSort().sort(testArray));
    }


} 
