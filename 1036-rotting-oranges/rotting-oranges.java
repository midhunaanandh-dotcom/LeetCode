class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int min = 0;

        int[][] copy = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(copy[i], Integer.MAX_VALUE);
        }

        for(int i = 0;  i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    dfs(grid, copy, i, j, 0);
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    if(copy[i][j] == Integer.MAX_VALUE) return -1;
                    
                    min = Math.max(copy[i][j], min);
                }
            }
        }
        return min;
    }

    public void dfs(int[][] grid, int[][] copy, int i, int j, int currentTime){
        if(i < 0 || i >= grid.length|| j < 0|| j >= grid[0].length || grid[i][j] == 0 || currentTime > copy[i][j]) return;

        copy[i][j] = currentTime;
        dfs(grid, copy, i + 1, j, currentTime + 1);
        dfs(grid, copy, i - 1, j, currentTime + 1);
        dfs(grid, copy, i, j + 1, currentTime + 1);
        dfs(grid, copy, i, j - 1 , currentTime + 1);
    }
}