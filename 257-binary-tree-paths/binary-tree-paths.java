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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return null;
        List<String> myList = new ArrayList<>();
        traverse(root, "",  myList);
        return myList;
    }
    public void traverse(TreeNode root, String str, List<String> myList){
        if(root.left == null && root.right == null){
            myList.add(str + root.val);
            return;
        }

        if(root.left != null){
            traverse(root.left, str + root.val + "->", myList);
        }

        if(root.right != null){
            traverse(root.right, str + root.val + "->", myList);
        }
    }

}