class Solution71 {
    public int maxScoreSightseeingPair(int[] values) {
        //values = [8,1,5,2,6]
        int l=0; int r=values.length-1;
        int max=0;
        while (l<r){

             max=values[l]+values[r]+r-l;
            if (values[l]>values[r]) r--;
            else l++;

        }
        return max;
    }


}