class Solution {
    public int reverse(int x) {
        int r = 0;
        char[] arr = (""+x).toCharArray();
        boolean is_negative = false;
        Stack st = new Stack<Integer>();
        for(char c : arr){
            if(c=='-'){
                is_negative=true;
                continue;
            }
            st.push(c);
        }
        char[] rt_arr = new char[arr.length];
        String s = "";
        while(!st.isEmpty()){
            s+=st.pop();
        }
        System.out.println(s);
        try{
            r = Integer.parseInt(s);
            if(r>0 && is_negative){
                r=-r;
            }
        } catch (Exception e) {
            r = 0;
        }
    return r;
    }
}