import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution33 {
    public List<String> generateParenthesis(int n) {
         String s="";


         return  dg(2*n,s,new ArrayList<>());

    }
    public List<String> dg (int level,String s,List<String>list){


        if (level==0) {
            if (isValid(s)) list.add(s);






           return list;}



        dg(level-1,s+"(",list);

        dg(level-1,s+")",list);
return list;

    }
    public boolean isValid(String s) {
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
    }

    public static void main(String[] args) {
        System.out.println(new Solution33().generateParenthesis(3));
    }





}