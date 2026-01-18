class Solution {
    public int vowelConsonantScore(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int n = s.length();
        int i;
        int v = 0;
        int c = 0;
        int score = 0;
        for(i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(set.contains(ch))
                v++;
            else if((!Character.isDigit(ch)) && (ch!=' '))
                c++;
            
        }
        if(c>0)
        score = v/c;
        return score;
        
    }
}