//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            

            Solution ob = new Solution();
            
            System.out.println(ob.lookandsay(n));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String lookandsay(int A) {
        
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
        
        //your code here
    }
}
