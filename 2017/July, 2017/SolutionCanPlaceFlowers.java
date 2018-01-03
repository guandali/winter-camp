//SolutionCanPlaceFlowers

public class SolutionCanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
    	boolean ans = false;
    	int count = 0;
        for(int idx = 0; idx < flowerbed.length; idx++){
            if(flowerbed[idx] == 1) continue;
            else if((idx - 1 >= 0 && idx + 1 < flowerbed.length) && (flowerbed[idx-1] == 0 && flowerbed[idx+1] == 0)){
            	flowerbed[idx] = 1;
            	count++;
            	idx++;
            }
            else if((idx == 0 && ((idx + 1 < flowerbed.length && flowerbed[idx+1] == 0) || idx + 1 >= flowerbed.length)) )
            {
            	flowerbed[idx] = 1;
            	count++;
            }
            else if(idx == flowerbed.length - 1 && (idx -1 < 0 || (idx -1 >= 0 && flowerbed[idx-1] == 0))){
            	flowerbed[idx] = 1;
            	count++;
            }
            if(count == n){
            	return true;
            }
        }
        return ans;
        
    }
    
}