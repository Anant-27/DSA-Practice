class Solution {
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length+1][grid[0].length+1];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        return PS(grid,0,0,dp);
    }
    public static int PS(int[][]grid,int cr,int cc,int[][] dp){
        if(cr==grid.length-1 && cc==grid[0].length-1){
            return grid[cr][cc];
        }
        if(cr>=grid.length || cc>=grid[0].length){
            return 9999999;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        int up=grid[cr][cc]+PS(grid,cr+1,cc,dp);
        int down=grid[cr][cc]+PS(grid,cr,cc+1,dp);
        return dp[cr][cc]= Math.min(up,down);
    }
}
