class Solution {
    public String countAndSay(int A) {
        if(A==1)
        {
            return "1";
        }
        A--;
        String num="1";
        while(A!=0)   
        {
            int i=0;
            int curr=-1;
            int count=0;
            String res="";
            while(i!=num.length())
            {
                //System.out.print(res+" ");
                int c=num.charAt(i)-'0';
                if(c==curr)
                {
                    count++;
                }
                else
                {
                    if(curr!=-1)
                    res= (res+ count)+curr;
                    curr=c;
                    count=1;
                }
                i++;
                //System.out.println(res+" "+curr+" "+count);
            }
            res= (res+ count)+curr;
            num=res;
            A--;
        }
        return num;
        
    }
}