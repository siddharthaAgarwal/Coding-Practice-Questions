class Solution {
public:
    uint32_t reverseBits(uint32_t a) {
        
         uint32_t rev=0;
        
        uint32_t i=0;
        while(i<32)
        {
            uint32_t rem= a%2;
            a>>=1;
            rev= rev<<1;
            rev+=rem;
            i++;
            //System.out.println(Long.toBinaryString(rev));
        }
        return rev;
    }
};