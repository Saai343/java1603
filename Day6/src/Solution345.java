import java.util.ArrayList;
import java.util.Arrays;

class Solution345 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        ArrayList<Character> vow = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(vow.contains(arr[l]) && vow.contains(arr[r])){
                char temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
                l++;
                r--;
            }
            else if (!vow.contains(arr[l])){
                l++;
            }
            else if (!vow.contains(arr[r])){
                r--;
            }
            else{
                l++;
                r--;
            }
        }
        return(new String(arr));
    }
}