package homeWork;

public class Array_2_matchUp {

    public int matchUp(int[] nums1, int[] nums2) {
        int n = 0;
        int t = 0;

        for (int i = 0; i < nums1.length; i++){
            t = nums1[i] - nums2[i];
            if (Math.abs(t) == 2 || Math.abs(t) == 1){
                n++;
            }
        }
        return n;
    }
}
