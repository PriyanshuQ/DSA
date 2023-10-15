class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> stack = new ArrayList<>();
        int counter = 0;
        for (String item : words){
            if (item.equals("prev")){
                counter+=1;
                if (counter > stack.size()){
                    answer.add(-1);
                }else{
                    answer.add(stack.get(stack.size()-counter));
                }
            }else{
                stack.add(Integer.parseInt(item));
                counter = 0;
            }
        }
        return answer;
    }
}