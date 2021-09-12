import java.util.Arrays;

class Solution44 {
    public void nextPermutation(int[] nums) {
          boolean flag=true;
          int len =nums.length; int a=0,b=0,temp=0;
        for (int i = len-1; i >=1 ; i--) {
                     //1 3 5 6  6 8 7 4 3 2 1
            if (nums[i] > nums[i-1])  {
                a=i-1;
            flag=false;
              break; }

       }
        if (flag) {Arrays.sort(nums);return;}

            for (int j = len-1; j >=0 ; j--) {
                //1 3 5 6  6 8 7 4 3 2 1
                    if (nums[j]>nums[a]) { b=j; break;}

                }
           temp= nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            reverse(nums,a+1);






}
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int []num={3,2,1};
        new Solution44().nextPermutation(num);
        System.out.println(Arrays.toString(num));
    }
}

//1 6 4 8
// 1 8 6 4




