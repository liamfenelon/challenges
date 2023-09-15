import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int max = (int) (Math.pow(10, 4) + 1);
        int k = nums.length;
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i-1] == nums[i] && nums[i] == nums[i+1] && nums[i] != max){
                nums[i] = max;
                i = i - 1;
                k = k - 1;
                Arrays.sort(nums);
            }
        }

        return k;
    }
}