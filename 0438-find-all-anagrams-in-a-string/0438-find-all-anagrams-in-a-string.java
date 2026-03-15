class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        int w = p.length();
        int left = 0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int i;
        if(n < w)
        return res;
        for(i = 0; i<w; i++){
            arr1[p.charAt(i) - 'a']++;
            arr2[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(arr1, arr2))
        res.add(0);
        for(int right = w; right<n; right++){
            arr2[s.charAt(right)- 'a']++;
            arr2[s.charAt(left) - 'a']--;
            left++; /*once we delete left element the start of next potential
            anagram is at left+1*/
            if(Arrays.equals(arr1, arr2))
            res.add(left);
            
        }
        return res;
        
    }
}