class Solution {
    public int strStr(String haystack, String needle) {
        int max_index = haystack.length() - needle.length();
        int i = 0;
        String curr = "";
        if (haystack.equals(needle)) {
            return 0;
        }
        if (max_index > 0) {
            while (i < max_index + 1) {
                curr = haystack.substring(i, i + needle.length());
                if (curr.equals(needle)) {
                    return i;
                }
                i++;
            }
        }
        return -1;

    }
}