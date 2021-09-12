import java.util.ArrayList;
import java.util.List;

class test {
       int num=0;
    public int uniquePaths(int n,int m) {



        return  dg(m+n,n,m);

    }
    public int dg (int level,int m,int n){


        if (level==0) {

            if (m==0&&n==0)
           num++;






            return num;}



        dg(level-1,m-1,n);

        dg(level-1,m,n-1);
        return num;

    }
    /*public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        //遍历所有的元素
        for (char c : chars) {
            //如果是左括号，就把他们对应的右括号压栈
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {      // ()()()
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                //否则就只能是右括号。
                //1，如果栈为空，说明括号无法匹配。
                //2，如果栈不为空，栈顶元素就要出栈，和这个右括号比较。
                //如果栈顶元素不等于这个右括号，说明无法匹配，
                //直接返回false。
                return false;
            }
        }return stack.isEmpty();
    }*/
    public static void main(String[] args) {
        System.out.println(new test().uniquePaths(102,6));
    }

}