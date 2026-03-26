class Solution1041 {
    public boolean isRobotBounded(String instructions) {
        int dir =0;
        int[] loc = new int[]{0,0};
        for(int i=0; i<instructions.length();i++){
            char ch = instructions.charAt(i);
            if(ch=='L') dir=(dir+3)%4;
            else if(ch=='R') dir=(dir+1)%4;
            if(ch=='G'){
                if(dir==0) loc[1]++;
                else if(dir==1) loc[0]--;
                else if(dir==2) loc[1]--;
                else loc[0]++;
            }
        }
        if(loc[0]==0 && loc[1]==0) return true;
        if(dir==0) return false;
        return true;
    }
}