package com.icedmaze.algorithm.dp;

/**
 *
 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 *
 * <example>
 *  输入： 2
 *  输出： 2
 *  解释： 有两种方法可以爬到楼顶。
 *  1.  1 阶 + 1 阶
 *  2.  2 阶
 * </example>
 *
 * @author jiangchangyu
 */
public class ClimbingStairs {

    /**
     * this problem can use dynamic programming to solve
     */
    public int climbStairs(int n) {

        //special condition
        if(n <= 3){
            return n;
        }
        //the dp1 is a variable represents the steps of the n-2
        int dp1 = 1;
        //the dp2 is a variable represents the steps of the n-1
        int dp2 = 2;
        //the steps of the n stairs
        int dp = 0;

        for(int i = 3; i <= n; i++){
            /*
             * the dp[n] consist of dp[n-1] and dp[n-2]
             * there has dp[n-2] steps to reach the stair n-2
             * and has dp[n-1] steps to reach the stair n-1
             * so there has dp[n-2] + dp[n-1] steps to reach the star n
             */
            dp = dp1 + dp2;
            //change the dp[n-1] steps to the dp[n-2]
            dp1 = dp2;
            //change the dp[n] steps to the dp[n-1]
            dp2 = dp;
        }
        return dp;
    }
}
