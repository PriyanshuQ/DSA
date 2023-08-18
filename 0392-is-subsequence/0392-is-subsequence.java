class Solution {
    public boolean isSubsequence(String s, String t) {
        int temp=0;
        if(temp==s.length()) return true;

        for(int i=0;i<t.length();i++){
            if(s.charAt(temp)==t.charAt(i)) temp++;
            if(temp==s.length()) return true;
        }
        return false;
    }
}