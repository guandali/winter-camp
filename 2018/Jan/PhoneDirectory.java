class PhoneDirectory {
    private Set<Integer> numbers = new HashSet<>();
    private final int MAX_NUMBERS; 
    private Random random = new Random();
    private Queue<Integer> removed = new LinkedList<>();
    private int nextNumber = 0;
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public PhoneDirectory(int maxNumbers) {
        this.MAX_NUMBERS = maxNumbers;
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        int tmp = -1;
        if(this.MAX_NUMBERS==numbers.size()) return tmp;
        if(!removed.isEmpty()){
            tmp = removed.poll();
        }
        else tmp = nextNumber++;
        // int tmp = getRandom();
        // while(!check(tmp)) tmp = getRandom();
        this.numbers.add(tmp);
        return tmp;
    }
    
    private int getRandom(){
        return Math.abs(random.nextInt());
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        return !this.numbers.contains(number);
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        if(!check(number)){
            removed.offer(number);
            this.numbers.remove(number);
        }
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */