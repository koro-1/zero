import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zero {
    public List<List<Integer>> twoSum(int[] nums,int traget) {// 总时间复杂度：O(n^2)
    List<List<Integer>> ans = new ArrayList<>(); int q=0;

    if (nums == null || nums.length < 2) return ans;

    Arrays.sort(nums); // O(nlogn)

    int a =0,b=nums.length-1;
    while (a<b){

        if (nums[a]+nums[b]==traget) {
           ans.add(new ArrayList<>(Arrays.asList(a, b)));
              return ans;

       }
        else if (nums[a]+nums[b]>traget) b--;
        else if (nums[a]+nums[b]<traget)a++;

       else a++;


    }


/*
    for (int i = 0; i<nums.length; i++) { // O(n^2)





        int a=i+1,b=nums.length-1,c=-nums[i];
        if (i > 0 && nums[i] == nums[i - 1]) continue;


        while (a<b) {

            if (nums[a] + nums[b] == c ){
            ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[a], nums[b])));
             while (a<b&&nums[a]==nums[a+1])a++;
             while (a<b&&nums[b]==nums[b-1])b--;
             a++;
             b--;
        }

        else if (nums[a] + nums[b] < c) {
            a++;
        } else if (nums[a] + nums[b] > c) {
               b--;
            }

        else   a++;

        }

    }
    return ans;*/
        return  ans;
}

    public static void main(String[] args) {
        int[] nums={0,1,2,5,6,5,4,1,2,3,6,2};int[] nums2={-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(new zero().twoSum(nums,7));
    }
}
