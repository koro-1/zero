import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solusion11 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums); int key=1; int max=0;
      if(  nums.length==1)return nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length-1 ; i++) {

            if(nums[i]!=nums[i+1]){ map.put(key,nums[i]); max=Math.max(max,key); key=0;
             }
            if(i+1==nums.length-1&&nums[i]!=nums[i+1])map.put(1,nums[i+1]);
            if(i+1==nums.length-1&&nums[i]==nums[i+1]) {map.put(key+1,nums[i+1]); max=Math.max(max,key+1); }

                key++;



        }
     return map.get(max);
    }
    /*
        private Map<Integer, Integer> countNums(int[] nums) {
            Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
            for (int num : nums) {
                if (!counts.containsKey(num)) {
                    counts.put(num, 1);
                } else {
                    counts.put(num, counts.get(num) + 1);
                }
            }
            return counts;

    }*/


    public static void main(String[] args) {
        int num[]={3};
        System.out.println(new Solusion11().majorityElement(num));
    }
}
