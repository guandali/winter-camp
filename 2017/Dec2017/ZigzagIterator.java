public class ZigzagIterator {
    private int count = 0;
    List<Integer> v1 = null;
    List<Integer> v2 = null;
    Iterator i1 = null;
    Iterator i2 = null;
    
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.i1 = v1.iterator();
        this.i2 = v2.iterator();
    }

    public int next() {
        if(count == 0){
            count = 1;
            if(i1.hasNext()){
                return (int)i1.next();
            }
            else return (int)i2.next();
        }
        else {
            count = 0;
            if(i2.hasNext()){
                return (int)i2.next();
            }
            else return (int)i1.next();
        }
    }

    public boolean hasNext() {
        return i1.hasNext() || i2.hasNext();
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */