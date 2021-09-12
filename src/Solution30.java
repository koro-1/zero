class Solution30 {
    public int maxArea(int[] height) {

        int  max=0,left=0,right=height.length-1;
     /*   for (int i = 0; i <height.length-1 ; i++) {
            for (int j = i+1; j <height.length ; j++) {

                max=Math.max(Math.min(i,j)*(j-i+1),max);


            }
        }*/
        while (left<right){

            max=Math.max(max,(right-left)*Math.max(height[left],height[right]));

            if (height[left]<height[right]) left++;
            else right--;



        }
        return max;





    }
}