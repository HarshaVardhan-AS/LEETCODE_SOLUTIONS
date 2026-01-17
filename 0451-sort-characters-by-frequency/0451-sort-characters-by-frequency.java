class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        int[][] arr = new int[128][2];
        int i;
        for(i = 0; i<128; i++)
        arr[i][0] = i;
        for(char c : ch){
            arr[c][1]++;
        }
        Arrays.sort(arr, (a,b) -> b[1] - a[1]);
        StringBuilder sb = new StringBuilder();
        for(i = 0; i<128; i++){
            char cur = (char)arr[i][0];
            int count = arr[i][1];
            if(count >0){
                for(int k = 0; k<count; k++)
                sb.append(cur);
            }
        }
        return sb.toString();
        
        
    }
}