class Solution {
    public boolean checkPerfectNumber(int num) {
        int num1 = 0;
        if(num % 2 != 0){
            return false;
        }else{
        
        for(int i  = 1 ; i<=num/2 ; i++){
            if(num % i == 0){
                num1 += i; 
            }
        }
        }

        return num1==num;
    }
}