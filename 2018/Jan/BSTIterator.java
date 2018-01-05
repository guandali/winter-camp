/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        while(root!=null){
            this.st.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !this.st.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmp = st.pop();
        int val = tmp.val;
        if(tmp.right!=null){
            tmp = tmp.right;
            while(tmp!=null){
                this.st.push(tmp);
                tmp = tmp.left;
            }
        }
        return val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */