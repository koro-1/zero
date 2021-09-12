import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution43 {
    public List<String> generateParenthesis(int n) {

        List<String>list=new ArrayList<>();

     return   dg(list,2*n,"");


    }
    public List<String> dg(List<String> list,int n,String s){
        if (n==0) {     if (pd(s))    list.add(s);return list;}


        dg(list,n-1,s+"(");
        dg(list,n-1,s+")");


        return list;
    }
    public  boolean pd(String s){
        Stack<Character>stack=new Stack<>();
     char []cr =  s.toCharArray();

        for (char c:cr
             ) {
            if (c=='(') stack.push(')');
            else if (stack.isEmpty() || stack.pop() != c) return false;

        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        System.out.println(new Solution43().generateParenthesis(3));
    }


}