package com.practice.array;

public class StockProfitLoss {
    public static  void  main (String[] args) {
         int [] prices = { 5,6,7,8,2,4};
         int minPrics = Integer.MAX_VALUE;
         int maxProfit = 0;
          for (int price : prices) {
              minPrics = Math.min(minPrics , price);
              maxProfit = Math.max(maxProfit , price-minPrics);
          }
        System.out.println(maxProfit);

    }
}
