class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] intm = new int[nums1.length];
        int[] rt = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int curr = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    intm[i] = j;
                }
            }
        }

        for (int k = 0; k < intm.length; k++) {
            int st = intm[k];
            int curr = nums2[st];
            for (int m = st; m < nums2.length; m++) {
                System.out.println("val " + nums2[m] + " curr " + curr);
                if (nums2[m] > curr) {
                    rt[k] = nums2[m];
                    break;
                } else if (m == nums2.length - 1) {
                    rt[k] = -1;
                    break;
                }
            }
        }
        return rt;
    }
}


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int rt[]= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int curr = nums1[i];
            boolean flag = false;
                    for(int j=0;j<nums2.length;j++){
                        if(nums2[j]==curr){
                            flag=true;
                        }
                        if(flag && nums2[j]>curr){
                            rt[i]=nums2[j];
                            break;
                        } else if (flag && j==nums2.length-1){
                            rt[i]=-1;
                            break;
                        }
                    
                    }
        }
        return rt;
    }
}


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int rt[] = new int[nums1.length];

        for (int curr : nums2) {
            while (!stack.isEmpty() && stack.peek() < curr) {
                // System.out.println(" peek "+stack.peek() +" curr "+curr);
                // If a bigger item is found, map all smaller ones with their next biggest
                int key = stack.pop();
                map.put(key, curr);
            }
            // System.out.println(curr); :: keep adding until a bigger item isnt found
            stack.push(curr);
        }
        int i = 0;
        for (int curr : nums1) {
            rt[i] = map.containsKey(curr) ? map.get(curr) : -1;
            i++;
        }

        return rt;
    }
}