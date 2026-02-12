class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxlen = 0;
        int n = s.length();
       int[] arr = new int[26];
       int mostfreq = 0;
       for(int right = 0; right <n; right++){
        int index = s.charAt(right) - 'A';
        arr[index]++;
        mostfreq = Math.max(mostfreq, arr[index]);
        int length = right - left +1;
        if(length > k + mostfreq){
        arr[s.charAt(left) - 'A']--;
        left++;
        }
        maxlen = Math.max(maxlen, right - left +1);
       }
       return maxlen;
    }
}