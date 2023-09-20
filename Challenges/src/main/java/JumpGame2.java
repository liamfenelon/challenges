public class JumpGame2 {
    public int jump(int[] nums) {
        int currPos = 0;
        int counter = 0;
        int jump = 0;
        while(currPos != nums.length - 1){
            counter++;
            jump = nums[currPos];
            if(jump + currPos >= nums.length-1){
                return counter;
            }
            for(int i = currPos; i < nums[currPos]; i++){
                if(jump < i + nums[currPos + i] && nums[currPos + i] != 0){
                    jump = i;
                }
            }
            currPos = currPos + jump;
        }
        return counter;
    }
}
