class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();
        char[] arr = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        for (char c : arr) {
            if (!st.isEmpty() && map.containsKey(st.peek()) && map.get(st.peek()) == c) {
                st.pop();
            } else{
                st.push(c);
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}