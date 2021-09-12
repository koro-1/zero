class Solution68 {
    public int getMaxLen(int[] nums) {
       int len = nums.length,max;
       int []z=new int[len]; int []f=new int[len];
       if (nums[0]>0) z[0]=1;
       else if (nums[0]<0)f[0]=1;
       max=z[0];
        for (int i =1 ; i <len ; i++) {

            if (nums[i]>0){
                z[i]=z[i-1]+1;
                f[i]=f[i-1]>0?f[i-1]+1:0;
            }
            else if ( nums[i]<0){

                z[i]=f[i-1]>0?f[i-1]+1:0;
                f[i]=z[i-1]+1;
            }
            else {
                z[i]=0;
                f[i]=0;
            }

          max=Math.max(max,z[i]);

        }

   return max;

    }
}

