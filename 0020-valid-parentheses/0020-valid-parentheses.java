import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        int n=s.length();
        if(n%2!=0)
            {
                return false;
            }
        for(int i=0;i<n;i++)
        {
            
           
            char l = s.charAt(i);
            if(l=='('||l=='{'||l=='[')
            {
                stack.push(l);
            }
            
            else{
                 if(stack.isEmpty())
            {
                return false;
            }
            
                char top=stack.peek();
                if(l==')'&&top!='(')
                {
                    return false;
                }
                if(l=='}'&&top!='{')
                {
                    return false;
                }
                if(l==']'&&top!='[')
                {
                    return false;
                }
                stack.pop();
            }


        }
        return (stack.isEmpty());

        
    }
}