
public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.val >= low && root.val <= high){
            sum = sum + root.val;
        }
        if(root.val < high && root.right != null){
            sum = sum + rangeSumBST(root.right, low, high);
        }
        if(root.val > low && root.left != null){
            sum = sum + rangeSumBST(root.left, low, high);
        }

        return sum;
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
