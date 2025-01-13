import java.util.Stack;

public class Valid_Parantheses {
    public boolean isvalid(String s){
        Stack<Character> stack =new Stack<>();
        for (char c:s.toCharArray()){
           if(c=='('|| c== '{'|| c== '['){
               stack.push(c);
           }else{
               if(stack.isEmpty()){
                   return false;

               }
               else{
                   char top = stack.peek();
                   if((c==')'&& top =='(')||(c=='}' && top =='{')||(c==']'&& top =='[')){
                       stack.pop();
                   }
                   else{
                       return false;
                   }
               }
           }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Valid_Parantheses vp =new Valid_Parantheses();
//        boolean result=vp.isvalid("({])");
//        boolean result=vp.isvalid("({])");
//        System.out.println(result);

        boolean result1=vp.isvalid("[({})]");
        System.out.println(result1);

    }
}
