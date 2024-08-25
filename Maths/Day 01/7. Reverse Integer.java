class Solution {
    public int reverse(int a) {
        long rev = 0L;
        while (a!=0){
            rev = rev*10+a%10;
            a = a/10;
        }
        if(rev>Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
        }
        return (int) rev;
    }
}