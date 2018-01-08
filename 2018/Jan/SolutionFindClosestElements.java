class SolutionFindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> answer = new ArrayList<>();
        if(arr==null||k>arr.length) return answer;
        int lo =0;
        int hi = arr.length-1;
        int mid = -1;
        while(lo<=hi){
            mid = lo + (hi-lo)/2;
            if(x<arr[mid]) hi = mid-1;
            else if(x>arr[mid]) lo = mid + 1;
            else break;
        }
        if(mid==-1) return answer;
        int left = mid;
        int right = mid + 1;
        int count = 0;
        while((left>=0||right<arr.length)&&count<k){
            int leftDiff = Integer.MAX_VALUE;
            int rightDiff = Integer.MAX_VALUE;
            if(left>=0) leftDiff = Math.abs(x-arr[left]);
            if(right<arr.length) rightDiff = Math.abs(arr[right] - x);
            if(leftDiff > rightDiff) {
                answer.add(arr[right]);
                right++;
            }
            else {
                answer.add(arr[left]); 
                left--;
            }
            count++;
        }
        Collections.sort(answer);
        return answer;
    }
}