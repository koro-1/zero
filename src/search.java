public class search {
    public int search(int[] nums, int target) {

        int left=0;int right=nums.length-1;
        int mid=(left+right)/2+1;
        while (left<right)
        {
            if (nums[mid]<target){
                left=mid+1;
                mid=(left+right)/2;
            }
            else if (nums[mid]>target)
            {
                right=mid-1;
                mid=(left+right)/2;

            }
            else return nums[mid];



        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[]={1,3,5,6,7,9};
        System.out.println( new search().search(nums,1));

    }
}
