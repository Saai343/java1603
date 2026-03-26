class Solution1217 {
    public int minCostToMoveChips(int[] position) {
        int countodd=0;
        int counteven=0;
        for(int num:position){
            if(num%2==0) counteven++;
            else countodd++;
        }
        return(Math.min(countodd,counteven));
    }
}