
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
        return dfs(adjList, visited, source, destination);
    }
    public boolean dfs(Map<Integer, List<Integer>> adjList, boolean[] visited, int src, int dest){
        if(src == dest) return true; //base case
        visited[src] = true;

        for(int neighbour: adjList.get(src)){
            if(!visited[neighbour]){
                if(dfs(adjList, visited, neighbour, dest)){
                    return true;
                }
            }
        }

        return false;
    }
}