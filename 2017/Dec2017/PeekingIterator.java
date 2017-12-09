// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private Queue<Integer> tmp = new LinkedList<>();
    private Iterator<Integer> iterator = null;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(tmp.isEmpty()){
            Integer nextValue = iterator.next();
            tmp.offer(nextValue);
            return nextValue;
        }
        return tmp.peek();

	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(tmp.isEmpty()){
            return iterator.next();
        }
        return tmp.poll();
	}

	@Override
	public boolean hasNext() {
	    return !tmp.isEmpty() || this.iterator.hasNext();
	}
}