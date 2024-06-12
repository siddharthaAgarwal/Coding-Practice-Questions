/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public void dfs(Node node, Node copy, Node[] visited) {
        visited[copy.val]= copy;

        for(Node n: node.neighbors)
        {
            if(visited[n.val]==null)
            {
                Node cp = new Node(n.val, new ArrayList<>());
                copy.neighbors.add(cp);
                dfs(n,cp, visited);
            }
            else
                copy.neighbors.add(visited[n.val]);
        }
    
    }

    public Node cloneGraph(Node node) {

        if(node==null)
            return node;

        Node[] visited= new Node[101];
        Node copy = new Node(node.val, new ArrayList<Node>());
        dfs(node,copy, visited);
        return copy;
    }
}