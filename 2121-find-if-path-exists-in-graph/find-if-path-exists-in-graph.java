
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        boolean[] visited = new boolean[n];
        for(int[] edge: edges){
            int u = edge[0], v = edge[1];
            adjList.putIfAbsent(u, new ArrayList<>());
            adjList.get(u).add(v);
            adjList.putIfAbsent(v, new ArrayList<>());
            adjList.get(v).add(u);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        
        while(!queue.isEmpty()){
            int a = queue.poll();

            if(a == destination) return true;

            for(int neighbour: adjList.get(a)){
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }

        return false;
    }
}