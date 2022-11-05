class Solution {
    String add(String a, String b)
    {
        int n=a.length()-1, m=b.length()-1;
        
        String res="";
        int c=0;
        while(n>=0 || m>=0)
        {
            int sum=c;
            if(n>=0)
            {
                sum+=(a.charAt(n)-'0');
                n--;
            }
            if(m>=0)
            {
                sum+=(b.charAt(m)-'0');
                m--;
            }
            c=sum/10;
            sum%=10;
            res=  sum+res;
            
        }
        if(c!=0)
            res="1"+res;
        return res;
    }
    
    public String multiply(String num1, String num2) {
        if(num1.length()>num2.length())
        {
            return multiply(num2,num1);
        }
        
        char[] n1= num1.toCharArray();
        char[] n2= num2.toCharArray();
        
        String res="";
        String zero = "";
        for(int i=n1.length-1; i>=0; i--)
        {
            String temp=""+zero;
            int carry = 0;
            int a = n1[i] - '0';
           for(int j=n2.length-1; j>=0; j--)
           {   
               int b = n2[j] - '0';
               
               if(a==0)
                   break;
               int mul = (a*b)+carry;
               temp = (mul%10) + temp;
                //System.out.print(a+"*"+b+"= "+temp+", ");
                carry = mul/10;

           }
            if(carry!=0)
            {
                temp=carry+temp;
            }
             if(a!=0)
             res = add(temp, res);

            zero+="0";
            
            //System.out.println(temp);
            //System.out.println(add("1368", "9120"));
            
        }
        if(res.equals(""))
            return "0";
        return res;
    }
}