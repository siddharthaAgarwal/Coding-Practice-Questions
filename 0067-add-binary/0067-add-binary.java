class Solution {
    public String addBinary(String a, String b) {
        int n= a.length()-1;
        int m= b.length()-1;
        
        StringBuilder res= new StringBuilder();
        
        int carry=0;
        while(n>=0 || m>=0)
        {
            int aInt=0, bInt=0;
            
            if(n>=0 && a.charAt(n) =='1')
                aInt = 1;
            if(m>=0 && b.charAt(m) =='1')
                bInt = 1;
            
            
            res.append((aInt+bInt+carry)%2);
            carry= ((aInt+bInt+carry)/2);
            
            //System.out.println(aInt +"  , "+bInt+"  ,"+carry);

            
            n--;m--;
        }
        
        if(carry==1)
            res.append(carry);
        
        return res.reverse().toString();
    }
}