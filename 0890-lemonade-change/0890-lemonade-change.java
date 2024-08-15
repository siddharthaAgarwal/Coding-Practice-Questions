class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0;
        int count10=0;

        for(int i:bills)
        {
            if(i==5)
            {
                count5++;
            }else if(i==10)
            {    
                if(count5==0)
                {
                    return false;
                }
                count5--;
                count10++;
            }else if(i==20)
            {
               if(count10!=0 && count5!=0)
               {
                 count10--;
                 count5--;
               }
               else if(count5>=3)
               {
                count5-=3;
               }
               else return false;
            }
        }

        return true;


   
    }
}