class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       int n = strs.length;
       int n1 = strs[0].length();
       int n2 = strs[n-1].length();
       int len = Math.min(n1, n2);
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i<len; i++){
        if(strs[0].charAt(i) == strs[n-1].charAt(i))
        sb.append(strs[0].charAt(i));
        else
        break;
       }
       return sb.toString();
    }
}