//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long a) {
        long rev=0;
        long i=0;
        while(i<32)
        {
            long rem= a%2;
            a>>=1;
            rev= rev<<1;
            rev+=rem;
            i++;
            //System.out.println(Long.toBinaryString(rev));
        }
        return rev;
    }
};