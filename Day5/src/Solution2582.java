class Solution2582 {
    public int passThePillow(int n, int time) {
        int rem = time%(n-1);
        if((time/(n-1))%2==0){
            return rem+1;
        }
        else{
            return n-rem;
        }
    }
}