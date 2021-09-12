class Solution84 {
     public int numberOfArithmeticSlices(int[] nums) {
          int n=0;
         for (int i = 3; i <=nums.length ; i++) {

             for (int j = 0; j <=nums.length-i ; j++) {
                  if (pd(nums,j,i)) n++;
             }



         }
         return  n;
    }

    public boolean pd(int[]num,int start,int len){
       int d= num[start+1]-num[start];
        for (int i = start+1; i <start+len ; i++) {

              if (num[i]-num[i-1]!=d)return false;

        }


         return true;

    }

    public static void main(String[] args) {
        int []num= {1, 2, 3,4,2,2,2,1,2,3};
        System.out.println(  new Solution84().numberOfArithmeticSlices(num));
    }
}