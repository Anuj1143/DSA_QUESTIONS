class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        for(int price:prices){
            if(price<minprice){
                minprice=price;

            }
            else if(price-minprice>profit){
                profit=price-minprice;
            }

        }
        return profit;

    }
}