/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionGetMinimumDifference {
    public int getMinimumDifference(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        traverse(pq, root);
        int min = Integer.MAX_VALUE;
        int prev = -1;
        int size = pq.size();
        if(size > 0) {
            prev = pq.poll();
            size--;
        }
        while(size > 0){
            int cur = pq.poll();
            min = Math.min(min, Math.abs(cur - prev));
            prev = cur;
            size--;
        }
        return min;
        
        
    }
    private void traverse(PriorityQueue<Integer> pq,TreeNode t ){
        if(t==null) return;
        else {
            pq.offer(t.val);
            traverse(pq, t.left);
            traverse(pq, t.right);
        }
    }
} 