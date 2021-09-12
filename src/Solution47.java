import java.util.Arrays;

class Solution47 {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int sum=0,num=0;
        for (int a:costs
             ) {
            sum=sum+a;
            if (sum>coins) return num;
            num++;

        }
        return num;

    }
}