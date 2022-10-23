class Solution {
    public String countAndSay(int A) {
        if(A==1)
        {
            return "1";
        }
        A--;
        StringBuilder num= new StringBuilder("1");
        while(A!=0)   
        {
            int i=0;
            int curr=-1;
            int count=0;
            StringBuilder res=new StringBuilder("");
            while(i!=num.length())
            {
                int c=num.charAt(i)-'0';
                if(c==curr)
                {
                    count++;
                }
                else
                {
                    if(curr!=-1)
                    res= res.append(count).append(curr);
                    curr=c;
                    count=1;
                }
                i++;
                //System.out.println(res+" "+curr+" "+count);
            }
            res= res.append(count).append(curr);
            num=res;
            A--;
        }
        return num.toString();
        
    }
}