class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int res = 0;
        char[] ch = s.toCharArray();
        int n = s.length();
        int i;
        for(i=0; i<n-1; i++){
            
                if(values.get(ch[i])<values.get(ch[i+1]))
                res-= values.get(ch[i]);
            
            else
            res+= values.get(ch[i]);
        }
        res+=values.get(ch[n-1]);
        return res;

        
    }
}