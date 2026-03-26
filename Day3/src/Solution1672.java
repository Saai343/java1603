class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] arr:accounts){
            int cost=0;
            for(int amt:arr){
                cost+=amt;
            }
            max=Math.max(cost,max);
        }
        return(max);
    }
}