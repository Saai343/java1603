class Solution1822 {
    public int arraySign(int[] nums) {
        int negcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) negcount++;
        }
        if(negcount%2==0) return 1;
        return -1;
    }
}