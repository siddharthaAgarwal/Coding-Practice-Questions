class Solution {
    public String intToRoman(int A) {
        
        
         String res="";
        while(A>=1000)
        {
            res+="M";
            A-=1000;
        }
        
        if(A>=900)
        {
            res+="CM";
            A-=900;
        }
        
        if(A>=500)
        {
            res+="D";
            A-=500;
        }
        
        if(A>=400)
        {
            res+="CD";
            A-=400;
        }
        
        while(A>=100)
        {
            res+="C";
            A-=100;
        }
        
        if(A>=90)
        {
            res+="XC";
            A-=90;
        }
        
        if(A>=50)
        {
            res+="L";
            A-=50;
        }
        
        if(A>=40)
        {
            res+="XL";
            A-=40;
        }
        
        while(A>=10)
        {
            res+="X";
            A-=10;
        }
        
        if(A>=9)
        {
            res+="IX";
            A-=9;
        }
        
        if(A>=5)
        {
            res+="V";
            A-=5;
        }
        
        if(A>=4)
        {
            res+="IV";
            A-=4;
        }
        
        while(A>=1)
        {
            res+="I";
            A-=1;
        }
        return res;
        
    }
}