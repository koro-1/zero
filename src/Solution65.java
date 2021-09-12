import java.util.HashSet;
import java.util.Set;

class Solution65 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer>set=new HashSet<>();

        for (int i = 0; i <ranges.length ; i++) {


            for (int j = left; j <=right ; j++) {
                if (j<ranges[i][0]||j> ranges[i][1]) continue;
                if (ranges[i][0] <=j&&  ranges[i][1]>=j){
                  set.add(j);
                  continue;}


            }





            
        }
        return set.size()== right-left+1;

    }

    public static void main(String[] args) {
        int [][]nums={{1,3},{4,6},{3,8}};
        System.out.println(new Solution65().isCovered(nums,2,5));
    }
}