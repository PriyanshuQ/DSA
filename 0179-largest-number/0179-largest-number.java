class Solution {
    public String largestNumber(int[] nums) {
        String[] strArr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strArr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strArr, new Comparator<String>(){
            public int compare(String a, String b){
                String ab = a+b;
                String ba = b+a;
                return ba.compareTo(ab);
            }
        });
        //210
        //9534330
        StringBuilder result = new StringBuilder();
        for(String str:strArr){
            result.append(str);
        }
        if(result.charAt(0)=='0') return "0";
        return result.toString();
    }
}