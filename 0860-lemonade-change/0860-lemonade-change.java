class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiver = 0;
        int tenner = 0;
        int n = bills.length;
        int i;
        for(i = 0; i<n; i++){
            if(bills[i] == 5)
            fiver++;
            else if(bills[i] == 10){
                if(fiver!= 0){
                    tenner++;
                    fiver--;
                }
                else
                return false;
            }
            else{
                if(tenner>=1 && fiver>=1){
                    fiver--;
                    tenner--;
                }
                else if(fiver>=3){
                    fiver-=3;
                }
                else
                return false;
            }
        }
        return true;
    }
}