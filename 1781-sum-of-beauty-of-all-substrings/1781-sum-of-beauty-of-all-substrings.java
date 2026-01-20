class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int i,j,k;
        int sum = 0;
        for(i = 0; i<n; i++){
            int[] arr = new int[26];

            for(j = i; j<n; j++){
                arr[s.charAt(j) - 'a']++;
                int maxfreq = 0;
                int minfreq = Integer.MAX_VALUE;
                for(k = 0; k<26; k++){
                    if(arr[k] > maxfreq)
                    maxfreq = arr[k];
                    if((arr[k]< minfreq) && arr[k]>0)
                    minfreq = arr[k];
                }
                
                sum+= (maxfreq - minfreq);
               
            }
        }
        return sum;
        
    }
}