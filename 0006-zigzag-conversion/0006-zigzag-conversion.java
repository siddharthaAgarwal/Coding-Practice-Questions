class Solution {
    public String convert(String A, int B) {
        
          StringBuilder[] res= new StringBuilder[B];
        int i=0;
        boolean forward=true;
        for(char c:A.toCharArray())
        {
            if(i==-1)
            {
                forward=true;
                i=(i+2)%B;
            }
            if(i==B)
            {
                forward=false;
                i=(B-2)%B;
            }
            if(res[i]==null)
                res[i]= new StringBuilder("");
            res[i]=res[i].append(c);

            if(forward)
            {
               i++;
            }
            else
            {
                i--;
            }
                    // System.out.println(i);
                           // System.out.println(Arrays.toString(res));

        }
        StringBuilder ans=new StringBuilder("");
        //System.out.println(Arrays.toString(res));
        for(StringBuilder r :res)
        {
            if(r!=null)
        ans=ans.append(r);
        }
        return ans.toString();
        
        
    }
}