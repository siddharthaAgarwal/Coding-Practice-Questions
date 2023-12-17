class Solution {
    
    public class CustomObject
    {
        CustomObject(int frequency, String node)
        {
            this.frequency = frequency;
            this.node = node;
        }
            
        int frequency;
        String node;
        
        public String toString()
        {
            return node+" "+frequency;
        }
    }
    
    
    public List<String> topKFrequent(String[] words, int k) {
        
        Comparator<CustomObject> comp = (obj1, obj2)-> {
            if(obj1.frequency == obj2.frequency)
            {
                return obj1.node.compareTo(obj2.node);
            }
            return obj2.frequency -obj1.frequency;
            
        };
        
        PriorityQueue<CustomObject> priorityQueue= new PriorityQueue<>(comp);
        
        HashMap<String, Integer> map = new HashMap<>();
        
        
        
        for(String word: words)
        {            
            map.put(word, map.getOrDefault(word,0)+1);
        }
    
    
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            CustomObject obj =new CustomObject(entry.getValue(), entry.getKey());
            priorityQueue.add(obj);            
        }
        
        //System.out.println(priorityQueue);
        
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            result.add(priorityQueue.poll().node);
        }
        
        return result;
    }
}