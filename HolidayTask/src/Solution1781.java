class Solution1781 {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] arr = new int[26];
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j)-'a']+=1;

                int min=Integer.MAX_VALUE;
                int max = 0;
                for(int k:arr){
                    if(k>0){
                        min = Math.min(k,min);
                        max = Math.max(k,max);
                    }
                }
                sum+=(max-min);
            }
        }
        return(sum);
    }
}