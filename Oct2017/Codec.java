/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            if(root != null){
                q.offer(root);
            }
            int size = q.size();
            sb.append("[");
            while(size != 0){
                int tmp = 0;
                while(size > 0){
                    TreeNode t = q.poll();
                    size --;
                    if(t == null) sb.append(",null");
                    else {
                            if(sb.length() == 1) sb.append("" + t.val);
                            else sb.append("," + t.val);
                            q.offer(t.left);
                            q.offer(t.right);
                            tmp += 2;
                    }
                }
                size = tmp;
            }
            sb.append("]");
            return sb.toString();
        }
    
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] arr = data.substring(1, data.length() - 1).split(",");
            TreeNode root = null;
            if(arr.length > 1){
                int idx = 1;
                root = new TreeNode(Integer.parseInt(arr[0]));
                Queue<TreeNode> q = new LinkedList<TreeNode>();
                q.offer(root);
                int size = 1;
                int tmp = 0;
                while(size != 0 && idx < arr.length){
                    while(size > 0 && idx < arr.length ){
                        TreeNode cur = q.poll();
                        size --;
                        if(cur != null){
                            String lv = arr[idx++];
                            String rv = arr[idx++];
                            TreeNode l = (lv.equals("null"))?null:new TreeNode(Integer.parseInt(lv));
                            TreeNode r = (rv.equals("null"))?null:new TreeNode(Integer.parseInt(rv));
                            cur.left = l;
                            cur.right = r; 
                            q.offer(l);
                            q.offer(r);
                            tmp += 2;
                        }  
                    }
                    size = tmp;
                }
                
            }
            return root;
            
        }
    }
    
    // Your Codec object will be instantiated and called as such:
    // Codec codec = new Codec();
    // codec.deserialize(codec.serialize(root));