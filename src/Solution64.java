import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution64 {
    public void sortColors(int[] nums) {
       int l=0;      int r=nums.length-1;

        // int[] nums={2,2,1,0,2,1};
        // int[] nums={2,2,1,0,2,1};
        while (l<r){
            if (nums[l]==2){
                if (nums[r]!=2) swap(nums,l,r);
                else {r--;l--;}


            }
            l++;



        }
        l=0; r=nums.length-1;
        while (l<r){
            if (nums[r]==0){
                if (nums[l]!=0) swap(nums,l,r);
                else {r++;l++;}


            }
            r--;



        }









    }

    public  void swap( int []nums,int a, int b){
        int temp;
        temp =nums[a];
        nums[a]= nums[b];
        nums[b]=temp;



    }
    public List<Integer> swap(int a, int b){
        int temp;
        temp =a;
        a= b;
        b=temp;
      return new ArrayList<Integer>(Arrays.asList(a,b));


    }

    public static void main(String[] args) {
        int[] nums={};
        new Solution64().sortColors(nums);

      /*  int temp=0;
        temp=a;
        a=b;
        b=temp;*/

        System.out.println(Arrays.toString(nums));

    }
}