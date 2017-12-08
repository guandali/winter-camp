class SolutionFractionAddition {
    public String fractionAddition(String expression) {
        int num = 0; 
        int deno = 0;
        int i = 0;
        boolean sign = true;
        while(i<expression.length()){
            boolean tmpSign = true;
            int start = i;
            char c = expression.charAt(i);
            if(c == '-') tmpSign = false;
            if(i!= 0 ||c == '-') i++;
            int tmpNum = 0;
            int tmpDeno = 0;
            while(i < expression.length() && expression.charAt(i)!='/'){
                tmpNum = tmpNum * 10 + expression.charAt(i) - '0';
                i++;
            }
            //will skip / 
            i++;
            
            while(i < expression.length() &&(expression.charAt(i) - '0' >= 0 && expression.charAt(i) - '0'<= 9)){
                tmpDeno = tmpDeno * 10 + expression.charAt(i) - '0';
                i++;
            }
            if(start == 0){
                sign = tmpSign;
                num = tmpNum;
                deno = tmpDeno;
            }
            else{
                int time = 1;
                if(deno != tmpDeno){
                    int saveDeno = deno;
                    int savedTmpDeno = tmpDeno;
                    tmpNum *= saveDeno;
                    tmpDeno *= saveDeno;
                    num *= savedTmpDeno;
                    deno *= savedTmpDeno;
                }
                if(!sign) num *= -1;
                if(!tmpSign) tmpNum *= -1;
                num += tmpNum;
                if(num >= 0) sign = true;
                else sign = false;
                //Simplify
                num = Math.abs(num);
            }
            if(num != 0){
                int maxDiv = num;
                while(maxDiv > 1){
                    if(deno%maxDiv == 0 && num%maxDiv == 0) break;
                    maxDiv--;
                }
                deno = deno/maxDiv;
                num = num/maxDiv;
            }
            else if(deno != 0){
                int maxDiv = deno;
                while(maxDiv > 1){
                    if(deno%maxDiv == 0 && num%maxDiv == 0) break;
                    maxDiv--;
                }
                deno = deno/maxDiv;
                num = num/maxDiv;
            }
        }
        if(num == 0) deno = 1;
        String ans = (!sign)?"-":"";
        return ans +num + "/" + deno;
    }
}