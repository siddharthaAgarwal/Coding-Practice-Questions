class Solution {

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.equals(sentence2))
            return true;


        String[] s1 = sentence1.split("\\s");
        String[] s2 = sentence2.split("\\s");
        int i1=0, i2=0, j1= s1.length-1, j2= s2.length-1;

        while(i1<=j1 && i2<=j2)
        {            

            if(s1[i1].equals(s2[i2]))
            {
                i1++;
                i2++;
            }
            else if(s1[j1].equals(s2[j2]))
            {
                j1--;
                j2--;
            }
            else
            {
                    return false;
            }
        }
        return true;
    }
}
