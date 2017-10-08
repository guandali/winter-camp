class SolutionLicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        String tmp = S.replace("-","").toUpperCase();
        int size = K;
        StringBuilder sb = new StringBuilder();
        int end = tmp.length();
        while(end != 0){
            int start = (end - size <= 0)?(0):(end - size);
            sb.insert(0, tmp.substring(start, end) + (end == tmp.length()?(""):("-")));
            end = start;
        }
        return sb.toString();
    }
}