class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int i=0;
        int j=0;
        int count=0;

        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                count = Math.max(count, set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return count;
    }
}