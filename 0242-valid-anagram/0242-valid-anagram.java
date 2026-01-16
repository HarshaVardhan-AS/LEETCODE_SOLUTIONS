class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
        return false;
        int[] arr = new int[26];
        int n = s.length();
        int i;
        for(i = 0; i<n; i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for(i = 0; i<n; i++){
            char ch = t.charAt(i);
            arr[ch - 'a']--;
        }
        for(i = 0; i<26; i++){
            if(arr[i]!=0)
            return false;
        }
        return true;
        
    }
}