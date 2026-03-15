class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxlen = 0;
        int n = s.length();
       int[] arr = new int[26];
       int mostfreq = 0;
      for(int right = 0; right<n; right++){
        arr[s.charAt(right) - 'A']++;
        mostfreq = Math.max(mostfreq, arr[s.charAt(right) - 'A']);
        while(right - left + 1 > mostfreq + k){
            arr[s.charAt(left) - 'A']--;
            left++;
        }
        maxlen = Math.max(maxlen, right-left+1);
      }
      return maxlen;
    }
}