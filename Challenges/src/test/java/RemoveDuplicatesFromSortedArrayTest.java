import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDups(){
        int[] input = {1,2,2,2,4};
        RemoveDuplicatesFromSortedArray removeDups = new RemoveDuplicatesFromSortedArray();
        removeDups.removeDuplicates(input);
    }
}
