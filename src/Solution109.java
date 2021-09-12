public class Solution109 {
    public boolean checkRecord(String s) {
        int absent=0,late=0;
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            switch (c){
                case 'A':  absent++; late=0; break;
                case 'P':  late=0; break;
                case 'L' :  late++; if (late==3)return false; break;
                default:
            }
        }
          return late<3&&absent<2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution109().checkRecord("LLLALL"));
    }
}
