class Solution557 {
    public String reverse(String s){
        char[] arr=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String rs = new String(arr);
        return(rs);
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=reverse(words[i]);
        }
        String res = new String();
        for(int i=0;i<words.length;i++){
            res = res + words[i];
            if(i!=words.length-1) res = res + " ";
        }
        return(res);
    }
}