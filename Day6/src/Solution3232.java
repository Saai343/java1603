class Solution3232 {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int double1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<10) single+=nums[i];
            else if(nums[i]>=10 && nums[i]<100) double1+=nums[i];
        }
        if(single==double1) return false;
        return true;
    }
}