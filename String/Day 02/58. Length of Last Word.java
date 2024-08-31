class Solution {
/*
    public int lengthOfLastWord(String s) {
        int rt = 0;
        if (s == null || s.length() < 1) {
            return rt;
        }
        String[] x = s.trim().split(" ");
        String last = x[x.length - 1];
        rt = last.trim().length();

        return rt;
    }
*/
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int y = 0;
        String t = s.trim();
        for (int i = t.length()-1; i>-1; --i) {
            if (" ".equals(t.substring(i, i + 1))) {
                y = i;
                break;
            }
        }

        String p = t.substring(y > 0 ? y + 1 : y);
        return p.length();
    }
}