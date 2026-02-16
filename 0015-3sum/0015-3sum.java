class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int i,j,k;
        Arrays.sort(nums);
        for( i = 0; i<n; i++){
            
            if((i > 0) &&( nums[i] == nums[i-1]))
            continue;
            j = i+1;
            k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0)
                k--;
                else if(sum < 0)
                j++;
                else if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    while(j<k && (nums[j] == nums[j+1])){  
                        j++;
                    }
                     while(j<k && (nums[k] == nums[k-1])){
                        k--;
                    }
                    j++;
                    k--;
                }
            
            }
            
        }
        return res;
        
    }
}