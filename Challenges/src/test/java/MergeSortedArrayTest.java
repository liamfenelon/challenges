import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortedArrayTest {

    @Test
    public void mergeTest(){
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i], nums1[i]);
        }
    }
}
