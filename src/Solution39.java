import java.util.Arrays;

class Solution39 {

  int n=0;

    public int jump(int[] nums){
        if (nums[0]==0)return  0;
        if (nums.length==1) return 1;

           if (nums[0]>=nums.length-1) return n+1;


           int len =nums.length; int max=0;
        for (int i =0; i <=nums.length-1 ; i++) {

//            max=Math.max(max,i+nums[i]);

            if (i+nums[i]>=nums.length-1)  {n++;return jump(Arrays.copyOfRange(nums,0,i+1));}

        }

return n;
    }



    public static void main(String[] args) {
        int[] num ={2,3,1,1,4};
        System.out.println(new Solution39().jump(num));;
    }
}