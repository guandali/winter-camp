class SolutionMaxProduct {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length;j++){
                String w0 = words[i];
                String w1 = words[j];
                int l0 = w0.length();
                int l1 = w1.length();
                int idx = 0;
                while(idx < w0.length()){
                    if(w1.indexOf(w0.charAt(idx)) != -1){
                        l0 = 0;
                        l1 = 0;
                        break;
                    }
                    idx++;
                }
                max = Math.max(max, l0 * l1);
            }
        }
        return max;
    }
}