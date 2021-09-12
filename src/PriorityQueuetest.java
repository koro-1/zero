import java.util.PriorityQueue;

public class PriorityQueuetest {

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        // 使用一个含有 k 个元素的最小堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a, b) -> a - b);
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            System.out.println( minHeap.poll());
        }
      /*  for (int i = k; i < len; i++) {
            // 看一眼，不拿出，因为有可能没有必要替换
            Integer topEle = minHeap.peek();
            // 只要当前遍历的元素比堆顶元素大，堆顶弹出，遍历的元素进去
            if (nums[i] > topEle) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }*/
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int []num ={6,5,3,2,1};
        new PriorityQueuetest().findKthLargest(num,5





































































































































































































        );
    }


}
