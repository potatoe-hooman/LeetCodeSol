class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack();
        for(String s  : operations){
                if ("C".equalsIgnoreCase(s)){
                    st.pop();
                } else if ("D".equalsIgnoreCase(s)){
                    st.push(st.peek()*2);
                } else if ("+".equalsIgnoreCase(s)){
                    int first = st.pop();
                    int second = st.peek();
                    st.push(first);
                    st.push(first+second);
                } else {
                    st.push(Integer.parseInt(s));
                }
        }
        int sum=0;
        for (int x : st){
            sum+=x;
        }
        return sum;
    }
}