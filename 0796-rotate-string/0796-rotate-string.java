class Solution {
    public boolean rotateString(String s, String goal) {
      String s1 = s+s;
      if(goal.length()!=s.length())
      return false;
      if(s1.contains(goal))
      return true;
      else
      return false;
        
    }
}