class Solution {
    public int minOperations(String[] logs) {
        int curr=0;
        for(String log: logs)
        {
            switch(log)
            {
                case "../" :
                curr= Math.max(0, curr-1);
                break;
                case "./": break;
                default: curr++;
            }
        }

        return curr;
    }
}