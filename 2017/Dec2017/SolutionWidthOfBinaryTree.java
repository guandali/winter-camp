/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionWidthOfBinaryTree {
    class Position{
        TreeNode node = null;
        int position = -1;
        public Position(TreeNode node,int position){
            this.node = node;
            this.position = position;
        }
    }
        public int widthOfBinaryTree(TreeNode root) {
            //BFS Solution 
            int maxWidth = 0;
            if(root==null) return maxWidth;
            Queue<Position> level = new LinkedList<Position>();
            level.offer(new Position(root, 1));
            while(!level.isEmpty()){
                int max = Integer.MIN_VALUE; 
                int min = Integer.MAX_VALUE;
                int size = level.size();
                while(size>0){
                    Position p = level.poll();
                    max = Math.max(max, p.position);
                    min = Math.min(min, p.position);
                    if(p.node.left!=null) level.offer(new Position(p.node.left, p.position*2-1));
                    if(p.node.right!=null) level.offer(new Position(p.node.right, p.position*2));
                    size--;
                }
                maxWidth = Math.max(maxWidth, max-min+1);
            }
            return maxWidth;
            
        }
    }