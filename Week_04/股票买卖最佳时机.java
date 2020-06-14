class Solution {
    public int maxProfit(int[] prices) {

        //应该在最低点进行买入
        //应该在最高点进行卖出
        //采用双指针，在表里价格的同时，记录最低价格（买入价格）相应偏移量或值

        //特殊情况处理
        if(prices.length < 2){
            return 0;
        }

        //买入价格
        int purchasePrice = 0;
        //是否已经交易
        Boolean hasTrade = false;
        //利润
        int profit = 0;


        for(int i=1; i < prices.length; i++){
            //如果当前价格小于之前元素（价格下跌),且已经购买股票
            if(prices[i] < prices[i-1] && hasTrade){
                //应当在昨日抛出股票，并结算利润
                profit += prices[i-1] - purchasePrice;
                hasTrade = false;

            }
            //如果当前价格大于之前元素（价格上涨），且未购买股票
            if(prices[i] > prices[i-1] && !hasTrade){
                //应当在昨日购入股票
                purchasePrice = prices[i-1];
                hasTrade = true;
            }
        }

        //清空手头股票
        if(hasTrade){
            profit += prices[prices.length - 1] - purchasePrice;
        }
        return profit;
    }
}