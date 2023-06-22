class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxA = 0;
        int n = heights.length;

        for(int i=0;i<=n;i++){
            while(!stack.empty() && (i==n || heights[stack.peek()]>=heights[i])){
                int height = heights[stack.peek()];
                stack.pop();

                int width;
                if(stack.empty()) width = i;
                else width = i-stack.peek()-1;
                maxA = Math.max(maxA, width*height);
            }
            stack.push(i);
        }
        return maxA;
    }
}