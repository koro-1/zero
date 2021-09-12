import java.util.HashMap;
import java.util.Map;

class Solution9 {
    public int maxProfit(int[] prices) {
        int tmp=prices[0],max=0; int a=0,b=0;

        HashMap<Integer,Integer>map   =new HashMap<>();
        for (int i = 0; i <prices.length ; i++) {
             tmp=Math.min(tmp,prices[i]);
            if (prices[i]-tmp>max){
                max=Math.max(prices[i]-tmp,max);
                map.put(max,i);
            }



        }
          if (map.get(max)==null)return 0;
       return max;
    }

    public static void main(String[] args) {
        int[]pri={1,2};
        System.out.println( new Solution9().maxProfit(pri));
    }

}