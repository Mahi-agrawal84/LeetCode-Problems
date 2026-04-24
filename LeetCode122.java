class LeetCode122 {
      public int maxProfit(int[] nums) {
        int n = nums.length;
        
        int totalProfit = 0;
        int buyPrice = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i]<buyPrice){
                buyPrice = nums[i]; // if we got a day when price is lesser than our buy replace it with curr price
            }else{
                totalProfit += nums[i] - buyPrice; // just accumulate all possible profits
                buyPrice = nums[i]; // this will now be buy price
            }
        }
        return totalProfit;
    }
}
