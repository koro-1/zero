public class compress {
    public int compress(char[] cs) {
        int n = cs.length;
        int i = 0, j = 0;
        while (i < n) {
            int idx = i;
            while (idx < n && cs[idx] == cs[i]) idx++;
            int cnt = idx - i;
            cs[j++] = cs[i];
            if (cnt > 1) {
                int start = j, end = j;
                while (cnt != 0) {
                    cs[end++] = (char)((cnt % 10) + '0');
                    cnt /= 10;
                }
                reverse(cs, start, end - 1);
                j = end;
            }
            i = idx;
        }
        for (char c:cs
             ) {
            System.out.println(c);
        }
        return j;
    }
    void reverse(char[] cs, int start, int end) {
        while (start < end) {
            char t = cs[start];
            cs[start] = cs[end];
            cs[end] = t;
            start++; end--;
        }
    }


    public static void main(String[] args) {
        char []a={'a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','c'};
        System.out.println(new compress().compress(a));
    }
}
