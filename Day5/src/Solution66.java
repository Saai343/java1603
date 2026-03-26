class Solution66 {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        if(digits[digits.length-1]/10==0) return(digits);
        else{
            int carry = 0;
            for(int i=digits.length-1;i>=0;i--){
                digits[i]+=carry;
                carry=digits[i]/10;
                digits[i]%=10;
            }
            if(carry>0){
                int[] fin = new int[digits.length+1];
                for(int i=0;i<digits.length;i++){
                    fin[i+1]=digits[i];
                }
                fin[0]=1;
                return fin;
            }
            else return digits;
        }
    }
}