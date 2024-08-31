class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String sx = s.substring(i, i + 1);
            if (map.containsKey(sx)) {
                map.put(sx, map.get(sx) + 1);

            } else {
                map.put(sx, 1);

            }
        }
        for (int i = 0; i < t.length(); i++) {
            String sx = t.substring(i, i + 1);
            if (map.containsKey(sx)) {
                int val = map.get(sx);
                if (val > 1) {
                    map.put(sx, val - 1);
                } else if (val == 1) {
                    map.remove(sx);
                }
            }
        }

        if (map.isEmpty()) {
            return true;
        }

        return false;

    }
}