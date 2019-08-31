package com.eargo.solution;

public class Profit {
	
	/*
	 * This solution return max profit 
	 * time complexity O(n)
	 * space complexity O(1)
	 * */
	
	public static int maxProfit(int[] prices) {
        if(prices.length <=1)
            return 0;
        
        int profit =0,j=0;
        
        for(int i=0;i<prices.length;i++){
        	
            if(i+1<prices.length && prices[i] < prices[i+1]){
            	j=i+1;
                
                //this loop continue upto next element is grater than previous 
                while(j<prices.length && prices[j] > prices[i]){
                    profit = Math.max(profit,prices[j]-prices[i]);
                    j++;
                }
                i=j-1;
            }else
                continue;
        }
        return profit;
    }

}
