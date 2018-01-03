/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class SolutionConnectTreeLinkNode {
    public void connect(TreeLinkNode root) {
        TreeLinkNode cur = root;
        TreeLinkNode nextStart = null;
        TreeLinkNode prev = null;
        while(cur != null){
            while(cur != null){
                if(nextStart == null){
                    if(cur.left != null) nextStart = cur.left;
                    else if (cur.right != null) nextStart = cur.right;
                }
                if(prev != null){
                    if(cur.left != null) prev.next = cur.left;
                    else if(cur.right != null) prev.next = cur.right;
                }
                if(cur.left != null && cur.right != null){
                    cur.left.next = cur.right;
                    prev = cur.right;
                }
                if(cur.right != null) prev = cur.right;
                else if(cur.right == null && cur.left != null) prev = cur.left;
                cur = cur.next;
            }
            cur = nextStart;
            prev = null;
            nextStart = null;
        }
        
    }
}