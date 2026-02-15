class Solution {
    public int longestSubstring(String s, int k) {
        return(longest(s,k));
        
    }
    public int longest(String s, int k){
        int[] arr = new int[26];
        int n = s.length();
        for(int i = 0; i<n; i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i<n; i++){
            if(arr[s.charAt(i) - 'a'] < k){
                String left = s.substring(0, i);
                String right = s.substring(i+1);
                return Math.max(longest(right, k), longest(left,k));

            }
        }
        return s.length();
    }
}