class Solution96 {
    public int titleToNumber(String columnTitle) {
         int sum=0;
      char []chars=  columnTitle.toCharArray();
        for (char c:chars
             ) {

              sum=sum*10+c-'0'-16;


        }



    return sum;
    }

    public static void main(String[] args) {
        System.out.println('B'-'0');
    }
}