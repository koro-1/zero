import java.util.Deque;
import java.util.LinkedList;

class Solution81 {
    public int trap(int[] height) {
        int ans = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        int n = height.length;
        for (int i = 0; i <height.length ; i++) {
            while (!stack.isEmpty()&&height[i]>height[stack.peek()])
            { int top=stack.pop();
              if (stack.isEmpty()) break;
              int left=stack.peek();
               int len= i-left-1;
               int h=Math.min(height[i],height[left])-height[top];
               ans+=len*h;



            }
            stack.push(i);
        }
        return ans;
    }
}

