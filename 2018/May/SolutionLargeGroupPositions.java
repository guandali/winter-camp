class SolutionLargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        int i = 0;
        while (i+2<S.length()){
            if(S.charAt(i)==S.charAt(i+1)&&S.charAt(i)==S.charAt(i+2)){
                int j = i+3;
                while(j<S.length()&&S.charAt(j)==S.charAt(i)) j++;
                results.add(Arrays.asList(i, j-1));
                i = j;
            }
            else i++;
        }
        return results;
    }
}