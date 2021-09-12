class Solution24{
    public int hammingDistance(int x, int y) {
         int num=0;
        for (int i = 0; i <32 ; i++) {


           if (x%2==y%2) num++;

            x/=2;
            y/=2;

        }
        return  num;



    }
}