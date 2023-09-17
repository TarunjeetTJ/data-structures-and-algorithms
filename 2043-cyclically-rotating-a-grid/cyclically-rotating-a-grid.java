class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int ktemp=k;
        int rmin=0;
        int rmax=grid.length-1;
        int cmin=0;
        int cmax=grid[0].length-1;
        while(rmin<rmax && cmin<cmax){
            int elements=((rmax-rmin+1)+(cmax-cmin-1))*2;
            ktemp=k%elements;
            for(int i=0;i<ktemp;i++){
                int temp=grid[rmin][cmin];
                for(int j=cmin;j<cmax;j++){
                    grid[rmin][j]=grid[rmin][j+1];
                }
                for(int j=rmin;j<rmax;j++){
                    grid[j][cmax]=grid[j+1][cmax];
                }
                for(int j=cmax;j>cmin;j--){
                    grid[rmax][j]=grid[rmax][j-1];
                }
                for(int j=rmax;j>rmin;j--){
                    grid[j][cmin]=grid[j-1][cmin];
                }
                grid[rmin+1][cmin]=temp;
            }
            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
        return grid;
    }
}