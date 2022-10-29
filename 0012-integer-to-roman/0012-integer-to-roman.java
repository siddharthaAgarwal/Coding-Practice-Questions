class Solution {
    public String intToRoman(int A) {
        
        
        StringBuilder res=new StringBuilder();
        while(A>=1000)
        {
            res.append("M");
            A-=1000;
        }
        
        if(A>=900)
        {
            res.append("CM");
            A-=900;
        }
        
        if(A>=500)
        {
            res.append("D");
            A-=500;
        }
        
        if(A>=400)
        {
            res.append("CD");
            A-=400;
        }
        
        while(A>=100)
        {
            res.append("C");
            A-=100;
        }
        
        if(A>=90)
        {
            res.append("XC");
            A-=90;
        }
        
        if(A>=50)
        {
            res.append("L");
            A-=50;
        }
        
        if(A>=40)
        {
            res.append("XL");
            A-=40;
        }
        
        while(A>=10)
        {
            res.append("X");
            A-=10;
        }
        
        if(A>=9)
        {
            res.append("IX");
            A-=9;
        }
        
        if(A>=5)
        {
            res.append("V");
            A-=5;
        }
        
        if(A>=4)
        {
            res.append("IV");
            A-=4;
        }
        
        while(A>=1)
        {
            res.append("I");
            A-=1;
        }
        return res.toString();
        
    }
}