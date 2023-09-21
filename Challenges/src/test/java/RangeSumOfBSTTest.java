import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeSumOfBSTTest {

    @Test
    public void nullTreeTest(){
        RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();
        rangeSumOfBST.rangeSumBST(null, 1, 10);
        assertEquals(0, rangeSumOfBST.rangeSumBST(null, 1, 10));
    }

    @Test
    public void sumOfEntireTreeTest(){
        RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();
        assertEquals(35, rangeSumOfBST.rangeSumBST(newTestTree(), 1, 10));
    }

    @Test
    public void sumOfSubTreeTest(){
        RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();
        assertEquals(21, rangeSumOfBST.rangeSumBST(newTestTree(), 6, 8));
    }

    public RangeSumOfBST.TreeNode newTestTree(){
        RangeSumOfBST.TreeNode leftLeftNode =  new RangeSumOfBST.TreeNode(2, null, null);
        RangeSumOfBST.TreeNode leftRightNode =  new RangeSumOfBST.TreeNode(4, null, null);
        RangeSumOfBST.TreeNode leftTree =  new RangeSumOfBST.TreeNode(3, leftLeftNode, leftRightNode);
        RangeSumOfBST.TreeNode rightRightNode =  new RangeSumOfBST.TreeNode(8, null, null);
        RangeSumOfBST.TreeNode rightLeftNode =  new RangeSumOfBST.TreeNode(6, null, null);
        RangeSumOfBST.TreeNode rightTree =  new RangeSumOfBST.TreeNode(7, rightLeftNode, rightRightNode);
        return new RangeSumOfBST.TreeNode(5, leftTree, rightTree);
    }


}
