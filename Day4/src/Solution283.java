class Solution283 {
    public void moveZeroes(int[] nums) {
        int a=0;
        for(int num:nums){
            if(num!=0){
                nums[a]=num;
                a++;
            }
        }

        for(int i=a;i<nums.length;i++){
            nums[i]=0;
        }
    }
}