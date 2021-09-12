import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution72 {
   /* List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        boolean []visited=new boolean[nums.length];
        for (int i = 0; i <nums.length+1 ; i++) {
            huisu(i,new ArrayList<>(),nums,visited,0);
        }


        return lists;

    }
    public void huisu(int index,List<Integer>path,int []nums,boolean []visited,int c){
        if (index==0) { lists.add(new ArrayList<>(path));return; }

        for (int i = c; i <nums.length ; i++) {

            if (visited[i]) { continue; }
            visited[i]=true;
            path.add(nums[i]);
            huisu(index-1,path,nums,visited,++c);

            path.remove(path.size()-1);

            visited[i]=false;

        }



    }*/
   public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       backtrack(0, nums, res, new ArrayList<Integer>());
       return res;

   }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }


    public static void main(String[] args) {
        int []num={1,2,2,3};
        System.out.println(new Solution72().subsets(num));
    }


}