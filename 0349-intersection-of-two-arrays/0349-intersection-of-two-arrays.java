class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<n1; i++)
        set.add(nums1[i]);
        for(int i = 0; i<n2; i++){
            if(set.contains(nums2[i])){
            res.add(nums2[i]);
            set.remove(nums2[i]);
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i<res.size(); i++){
              ans[i] = res.get(i);
        }
        return ans;
    }
}