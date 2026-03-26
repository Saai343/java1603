class Solution2220 {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int result = start^goal;
        while(result>0){
            if (result%2==1) count++;
            result/=2;
        }
        return count;
    }
}