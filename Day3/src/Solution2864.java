class Solution2864 {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(char i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<count-1;i++){
            sb.append("1");
        }
        for(int i=count-1;i<s.length()-1;i++){
            sb.append("0");
        }
        sb.append("1");
        return(sb.toString());
    }
}