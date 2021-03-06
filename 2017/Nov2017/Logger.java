class Logger {
    Map <String, Integer> m;

    /** Initialize your data structure here. */
    public Logger() {
        this.m = new HashMap<>();
        
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean ans = true;
        int prevTime = m.getOrDefault(message, -11);
        
        if (timestamp - prevTime >= 10){
            m.put(message, timestamp);
            return true;
        }
        return false;
        
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */