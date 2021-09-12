import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution54 {

    List<List<Integer>> res;
    int []sizes; int sum=0;
    public int combinationSum4(int[] nums, int target) {
           return combinationSum(nums,target).size();
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        boolean []vistied=new boolean[candidates.length];

        backtrack(candidates, target, new ArrayList<>(), 0,vistied);
       /* for (List<Integer> list:res
             ) {
                 sizes[sum]=list.size();
                System.out.println(sizes[sum]);
                 sum++;


        }
*/
        return res;
    }

    private void backtrack(int[] candidates, int remains, List<Integer> path, int start,boolean []vistited){
        if(remains == 0){

            res.add(new ArrayList<>(path));
            return;              // 11125
        }
                           // 0 1 2 3
        for(int i = 0; i < candidates.length; i++){

            if(candidates[i] > remains)
                return;
         /*   if (i > start && candidates[i] == candidates[i - 1]) {
                continue;         //减枝
            }*/
     if(i>0&&candidates[i]==candidates[i-1])continue;
            //[2,2,3,5]
        /*    if (vistited[i]) continue;*/
        /*    vistited[i]=true;  */         //减 同
            path.add(candidates[i]);

            backtrack(candidates, remains - candidates[i], path, i,vistited);
         /*   vistited[i]=false;*/
            path.remove(path.size() - 1);


        }
    }
    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(new Solution54().combinationSum4(nums,4));
    }

}

