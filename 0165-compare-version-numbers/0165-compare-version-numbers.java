class Solution {
    
    public int check(String num1, String num2)
    {
        while(num1.length()>num2.length())
        {
            num2= "0"+num2;
        }
        while(num1.length()<num2.length())
        {
            num1= "0"+num1;
        }
        
        return num1.compareTo(num2);
        
    }
    
    
    public int compareVersion(String A, String B) {
        String[] a =A.split("\\.");
        String[] b =B.split("\\.");
        
        int n= a.length;
        int m= b.length;
        int i=0;
        
        
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        
        while(i<n || i<m)
        {    
            String num1="0",num2="0";
            
            if(i<n)
            {
                num1=a[i];
            }
            if(i<m)
            {
                num2=b[i];
            }
            
            int check = check(num1, num2);
            if(check!=0)
            {
                return check<0?-1:1;
            }
            i++;
           // System.out.println(num1+" "+num2);
        }
        
        return 0;
        
    }
}