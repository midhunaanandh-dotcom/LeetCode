/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int currentDiameter = calculateHeight(root.left) + calculateHeight(root.right);

        int firstComparison = Math.max(leftDiameter, rightDiameter);
        return Math.max(firstComparison, currentDiameter);  

    }
    public int calculateHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(calculateHeight(root.left), calculateHeight(root.right)) + 1;
    }
}