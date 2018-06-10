package com.codility.maximumslice;
class MaxProfitSolution {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,5}));
		System.out.println(rewritesolution(new int[] {1,2,3,4,5}));
	}
    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i = 0 ; i < A.length ; i++ ){
            //changing minimum
        	min = A[i] < min ? A[i]:min;
        	//System.out.println("Minimum =>"+min);
            max = A[i] - min > max ? A[i] - min : max;
            //System.out.println(max);
        }
        return max;
    }
    
    public static int rewritesolution(int[] A) {
    	int minStockValue = Integer.MAX_VALUE;
    	int stockMaxProfit = 0;
    	for(int i=0; i<A.length; i++) {
    		if(minStockValue > A[i]) {
    			minStockValue = A[i];
    		}
			if ((A[i] - minStockValue) > stockMaxProfit) {
    			stockMaxProfit = A[i]-minStockValue;
    		}
    	}
    	//System.out.println(minStockValue);
    	return stockMaxProfit;
    }
}