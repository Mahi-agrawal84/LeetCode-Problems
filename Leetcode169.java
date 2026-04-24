 class LeetCode169 {
    public int majorityElement(int[] nums) {
        return sol(nums);
        
    }
    public static int sol(int arr[])
    {
        int cnt=0;
        int val=-1;
        int i=0;
        while(i<arr.length)
        {
            if(cnt==0)
            {
                cnt=1;
                val=arr[i];
            }
            else if(arr[i]==val)
            {
                cnt+=1;
            }
            else
            {
                cnt--;
            }
            i++;
        }
        return val;
    }
}