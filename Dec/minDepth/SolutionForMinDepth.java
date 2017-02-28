/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class SolutionForMinDepth {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        List <TreeNode> list0 = new ArrayList<TreeNode>();
        list0.add(root);
        List <TreeNode> list1 = new ArrayList<TreeNode>();
        
        int depth = 1;
        while (true){
            for(TreeNode n : list0){
                if (n.left == null && n.right == null ){
                    return depth;
                }
                if(n.left != null){
                    list1.add(n.left);
                }
                
                if(n.right != null){
                    list1.add(n.right);
                }
                
                
                
            }
            depth++;
            list0.clear();
            list0 = list1;
            list1.clear();
        }
        
    }
}