class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i;
        int n1 = strs.length;
        int n = Math.min(strs[0].length(), strs[n1-1].length());
        StringBuilder sb = new StringBuilder();
        for(i = 0; i<n; i++){
            if(strs[0].charAt(i) == strs[n1-1].charAt(i))
            sb.append(strs[0].charAt(i));
            else
            break;
        }
        return sb.toString();
        
    }
}