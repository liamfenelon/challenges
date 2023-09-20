import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpGame2Test {

    @Test
    public void jumpingOnes(){
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] input = {1,1,1,1,1};
        assertEquals(4, jumpGame2.jump(input));
    }

    @Test
    public void jumpingTwos(){
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] input = {2,1,2,1,2};
        assertEquals(2, jumpGame2.jump(input));
    }

    @Test
    public void jumpingWithSteps(){
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] input = {2,3,1,1,4};
        assertEquals(2, jumpGame2.jump(input));
    }

    @Test
    public void jumpingSmallArray(){
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] input = {2,3,1};
        assertEquals(1, jumpGame2.jump(input));
    }

    @Test
    public void jumpingBIGArray(){
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] input = {5,9,3,2,1,0,2,3,3,1,0,0};
        assertEquals(1, jumpGame2.jump(input));
    }

}

