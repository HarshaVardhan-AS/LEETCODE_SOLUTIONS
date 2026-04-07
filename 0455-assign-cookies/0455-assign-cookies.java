class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n1 = g.length;
        int n2 = s.length;
        int i;
        int j = 0;
        int count = 0;
        for(i = 0; i<n2; i++){
            if(j <n1 && (s[i] >=g[j])){
                count++;
                j++;    
            }
        }
        return count;
    }
}