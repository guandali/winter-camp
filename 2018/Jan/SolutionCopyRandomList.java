/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class SolutionCopyRandomList {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> nodes = new HashMap<>();
        RandomListNode dummy = new RandomListNode(-1);
        RandomListNode cur = dummy;
        while(head!=null){
            RandomListNode tmp  = null;
            RandomListNode tmpRandom = null;
            if(nodes.containsKey(head)){
                tmp = nodes.get(head);
            }
            else{
                tmp = new RandomListNode(head.label);
                nodes.put(head, tmp);
            }
            if(head.random!=null){
                if(nodes.containsKey(head.random)){
                    tmpRandom = nodes.get(head.random);
                }
                else{
                    tmpRandom = new RandomListNode(head.random.label);
                    nodes.put(head.random, tmpRandom);
                }
            }
            cur.next = tmp;
            cur.next.random = tmpRandom;
            cur = cur.next;
            head = head.next;
        }
        return dummy.next;
    }
}