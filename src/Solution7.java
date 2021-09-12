
public class Solution7 {
    int i = 0;
    public int firstBadVersion(int n) {

        for (int i = 0; i <n-1 ; i++) {

           if (isBadVersion(i)!=isBadVersion(i+1))
               System.out.println(i+1);
           break;

        }


     return i+1;

    }

    private boolean isBadVersion(int i) {
        return false;
    }
}

