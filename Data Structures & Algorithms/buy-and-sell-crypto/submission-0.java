class Solution {
    public int maxProfit(int[] prices) {
        int minprice,maxprofit;
        minprice=prices[0];
        maxprofit=0;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
                continue;
            }
            maxprofit=Math.max(maxprofit,price-minprice);
        }
        return maxprofit;
    }
}
