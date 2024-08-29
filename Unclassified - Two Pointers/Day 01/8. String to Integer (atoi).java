class Solution {
    public int myAtoi(String s) {
        char[] ch = s.toCharArray();
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', ' ', '+' };
        long rt = 0l;
        int multi = 1;
        boolean started = false;
        for (char c : ch) {

            int num_i = indexOf(num, c);
            if (started && num_i > 9) {
                break;
            }
            if (!started && (num_i == 11)) {

                continue;
            }
            if (!started && (num_i == 12)) {
                started = true;
                continue;
            }

            if (num_i > -1) {
                if (!started && num_i == 10) {
                    multi = -1;
                    started = true;
                    continue;
                }
                if (rt > 0 && rt / 10 == 0 && multi < 0) {
                    rt = multi * rt;
                }
                rt = rt * 10 + ((rt <= 0) ? multi * num_i : num_i);
                started = true;
                if (rt >= Integer.MAX_VALUE) {
                    rt = Integer.MAX_VALUE;
                    break;
                }
                if (rt <= Integer.MIN_VALUE) {
                    rt = Integer.MIN_VALUE;
                    break;
                }
                continue;
            } else {
                break;
            }
        }

        if (rt < 10 && rt > 0 && multi == 1) {
            rt = multi * rt;
        }

        return (int) rt;

    }

    public int indexOf(char[] ch, char c) {
        int i = 0;
        for (char x : ch) {
            if (x == c) {
                return i;
            }
            i++;
        }
        return -1;
    };
}