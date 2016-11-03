package test.com.ssthouse;

import com.ssthouse.SimpleSelectionSort;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;

/**
 * SimpleSelectionSort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Nov 3, 2016</pre>
 */
public class SimpleSelectionSortTest {

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
        assertArrayEquals(new SimpleSelectionSort().sort(testArray), expectResultArray);
    }


} 
