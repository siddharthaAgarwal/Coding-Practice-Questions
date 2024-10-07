class Solution {
    public int minLength(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push('~');
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='B' && stack.peek() == 'A')|| (s.charAt(i)=='D' && stack.peek() == 'C'))
            {
                stack.pop();
            }
            else 
            {
                stack.push(s.charAt(i));
            }
                        // System.out.println(stack);

        }
        return stack.size()-1;
    }
}