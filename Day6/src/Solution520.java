class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word.charAt(0)>='A' && word.charAt(0)<='Z'){
            int count = 1;
            for(int i=1;i<word.length();i++){
                if (word.charAt(i)>='A' && word.charAt(i)<='Z') count++;
            }
            if(count==1 || count==word.length()) return true;
            else return false;
        }
        else{
            int count = 0;
            for(int i=1;i<word.length();i++){
                if (word.charAt(i)>='A' && word.charAt(i)<='Z') count++;
            }
            if (count==0) return true;
        }
        return false;
    }
}