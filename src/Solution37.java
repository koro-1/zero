class Solution37 {
    public int rob(int[] nums) {
        if (nums.length==1)return nums[0];
       int []f=new int[nums.length+1];
        int []f2=new int[nums.length+1];

        f[0]=0;
       f[1] =nums[0];

         for (int i=2;i<=nums.length-1;i++){

             f[i]=Math.max(f[i-1],f[i-2]+nums[i-1]);
         }
          f2[0]=0;
         f2[1]=nums[1];

        for (int i=2;i<=nums.length-1;i++){

            f2[i]=Math.max(f2[i-1],f2[i-2]+nums[i]);
        }


         return Math.max(f[nums.length-1],f2[nums.length-1]);//3 6  3 2 5 3 6
    }


    public static void main(String[] args) {
        int  []num={0};
        System.out.println(new Solution37().rob(num));
    }
}