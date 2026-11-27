class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        int i;
        for(i = 0; i<n; i++){
            char[] s1 = strs[i].toCharArray();
            Arrays.sort(s1);
            String k = String.valueOf(s1);
            if(!map.containsKey(k)){
                List<String> l1 = new ArrayList<>();
                l1.add(strs[i]);
                map.put(k, l1);
            }
            else
            map.get(k).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for(var entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}