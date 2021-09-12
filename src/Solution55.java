import java.util.ArrayList;
import java.util.List;

class Solution55 {

    List< List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
          boolean []dp=new boolean[nums.length];
          digui(nums.length,new ArrayList<Integer>(),nums,dp);
     return list;
    }
    public void digui(int num,List<Integer> path,int []nums,boolean []dp){
        if (num==0) { list.add(new ArrayList<>(path));return;}
        for (int i = 0; i <nums.length ; i++) {
            if (dp[i]) continue;
            path.add(nums[i]); dp[i]=true;
            digui(num-1,path,nums,dp);
            path.remove(path.size()-1);
            dp[i]=false;


        }




    }



    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(new Solution55().permute(nums));
    }





}