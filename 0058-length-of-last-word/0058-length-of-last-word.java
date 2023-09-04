class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean space = false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') space=true;
            else if(s.charAt(i)!=' ' && space==true){
                count=1;
                space=false;
            }else count++;
        }
        return count;
    }
}