class SolutionFindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        for(int i = 0; i < list1.length; i++){
            m.put(list1[i], i);
        }
        List<String> tmp = new ArrayList<String>();
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length; i++){
            if(m.containsKey(list2[i])){
                int tmpSum = m.get(list2[i]) + i;
                if(tmpSum == minSum){
                    tmp.add(list2[i]);
                }
                else if(tmpSum < minSum){
                    tmp.clear();
                    tmp.add(list2[i]);
                    minSum = tmpSum;
                }
            }
        }
        
        return tmp.toArray(new String[tmp.size()]);
        
    }
}