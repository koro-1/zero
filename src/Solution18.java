import java.util.HashMap;
import java.util.Map;

class Solution18 {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> counts=countNums(nums);

            if (counts.containsKey(target))return counts.get(target);
            else  return 0;



    }

    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;}

}