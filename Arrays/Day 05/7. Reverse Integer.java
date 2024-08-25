class Solution {
    public int reverse(int x) {
        String s = ""+x;
        char[] arr = s.toCharArray();
        String rt = "";
        int r =0;
        if (arr[0]=='-'){
            // in case of negatives, ignore first place
            for(int i =1;i<arr.length/2+1;i++){
                char temp = arr[arr.length-i];
                arr[arr.length-i]=arr[i];
                arr[i] = temp;
            }
            System.out.println(new String(arr));
        } else {
            for(int i =0;i<(arr.length)/2;i++){
                char temp = arr[arr.length-i-1];
                arr[arr.length-i-1]=arr[i];
                arr[i] = temp;
            }
        }
    try{
        r = Integer.parseInt(new String(arr));
    } catch (Exception e) {
        r=0;
    }
    return r;
    }
}