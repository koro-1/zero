import java.util.Arrays;
import java.util.Stack;

public class dailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {


        int n = temperatures.length;
        int []res=new int[n];
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < n; ++i) {
            while (!st.empty() && temperatures[i] > temperatures[st.peek()]) {
                int t = st.peek();
                System.out.println(t); st.pop();
                res[t] = i - t;
            }
            st.push(i);
        }
        return res;









    }

    public static void main(String[] args) {
         int []nums={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(new dailyTemperatures().dailyTemperatures(nums)));
    }
}
