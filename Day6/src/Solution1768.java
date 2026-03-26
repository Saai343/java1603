class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        char[] arr=new char[word1.length() + word2.length()];
        int ind=0,res=0;
        while(ind<word1.length() || ind<word2.length()){
            if(ind<word1.length()){
                arr[res]=word1.charAt(ind);
                res++;
            }
            if(ind<word2.length()){
                arr[res]=word2.charAt(ind);
                res++;
            }
            ind++;
        }
        return(new String(arr));
    }
}