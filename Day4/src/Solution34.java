class Solution34 {
    public int search(int[] nums,int target){
        int st=0;
        int end = nums.length-1;
        while(st<=end){
            int mid = st+(end - st)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) end=mid-1;
            else st=mid+1;
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int any = search(nums,target);
        if(any == -1) return(new int[]{-1,-1});
        int left=any;
        int right=any;
        int flag=0;
        while(left > 0 && nums[left-1]==target) left--;
        while(right < nums.length-1 && nums[right+1]==target) right++;

        return(new int[]{left,right});
    }
}