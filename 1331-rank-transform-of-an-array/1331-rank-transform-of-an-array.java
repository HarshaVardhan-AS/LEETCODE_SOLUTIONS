class Solution {
    public int[] arrayRankTransform(int[] arr) {
         int n = arr.length;
        int[] copy = new int[n];
        int i;
        for(i = 0; i<n; i++)
        copy[i] = arr[i];
        Arrays.sort(copy);
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(i = 0; i<n; i++){
            if(map.containsKey(copy[i]))
            continue;
            else
            map.put(copy[i], rank);
            rank = rank+1;
        }
        int[] res = new int[n];
        for(i = 0; i<n; i++){
            res[i] = map.get(arr[i]);
        }
        return res;
        
    }
}