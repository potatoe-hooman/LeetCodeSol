class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        int sum_a = 0;
        int sum_b = 0;

        for (int x : nums){
            if(set.add(x)){
                continue;
            } else {
                return true;}
        }

        return false;
    }
}