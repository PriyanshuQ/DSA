class Solution {
    public int evalRPN(String[] str) {
        Stack <Integer> st = new Stack <>();
        for(String s:str)
        {
            if(s.equals("+"))
            {
                int x=st.pop();
                int y=st.pop();
                st.push(x+y);
            }
           else if(s.equals("*"))
            {
                int x=st.pop();
                int y=st.pop();
                st.push(x*y);
            }
            else if(s.equals("-"))
            {
                int x=st.pop();
                int y=st.pop();
                st.push(y-x);
            }
           else if(s.equals("/"))
            {
                int x=st.pop();
                int y=st.pop();
                st.push(y/x);
            }
            else
            st.push(Integer.parseInt(s));
        }
       return st.peek(); 
    }
}