
public class RangeSumOfBST {

    int SUM = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root != null){
            if(root.val >= low && root.val <= high){
                SUM = SUM + root.val;
            }
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
        return SUM;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
