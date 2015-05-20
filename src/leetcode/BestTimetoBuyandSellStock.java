package leetcode;

public class BestTimetoBuyandSellStock {
	
    public int maxProfit(int[] prices) {
        int result = 0;
    	if (prices.length == 0) return 0;
        
    	int minPoint = prices[0];
    	int curProfit = 0;
        for (int i = 1; i < prices.length; i++) {
        	if (prices[i] < minPoint) {
        		minPoint = prices[i];
        	}
        	
        	curProfit = prices[i] -minPoint;
        	if(curProfit > result) result = curProfit;
        }
        
    	return result;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
