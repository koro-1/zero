import java.util.Arrays;

class Solution6 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i <n ; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);




    }


    public static void main(String[] args) {
        int nums1[]={1,2,4,0,0};
        int nums2[]={2,3};
        new Solution6().merge(nums1,3,nums2,2);
        System.out.println(Arrays.toString(nums1));
    }
}