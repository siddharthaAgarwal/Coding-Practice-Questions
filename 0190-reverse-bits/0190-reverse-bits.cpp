class Solution {
public:
    uint32_t reverseBits(uint32_t a) {
        
        uint32_t rev=0;
        uint32_t i=0;
        while(i<32)
        {
            uint32_t rem= a%2;
            rev<<= 1;
            rev+=rem;
            i++;
            a>>=1;
        }
        return rev;
    }
};