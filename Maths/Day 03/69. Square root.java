class Solution {
    public int mySqrt(int x) {
        int mid = 0;
        if (x < 2) {
            return x;
        }

        int left = 0;
        int right = 50000;
        while (left < right) {
            mid = left +(right-left) / 2;
        //    System.out.println(mid);
            if ((mid == x / mid) || ((mid + 1) > x / (mid + 1) && mid < x / mid)) {
                return mid;
            } else if (mid < x / mid) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return mid;
    }

    /*
     * public int mySqrt(int x) {
     * int rt=0;
     * if(x>0 && x<=3){
     * return 1;
     * }
     * for(int i=1;i<=x/2;i++){
     * if(i==x/i){
     * return i;
     * } else if ((i+1)>x/(i+1)){
     * rt=i;
     * break;
     * }
     * }
     * return rt;
     * }
     */
}