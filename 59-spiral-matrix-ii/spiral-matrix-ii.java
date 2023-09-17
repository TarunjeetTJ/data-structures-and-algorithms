class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int rstart=0;
        int cstart=0;
        int rend=arr.length-1;
        int cend=arr[0].length-1;
        int elements=n*n;
        int count=1;
        while(count<=elements){
            for(int j=cstart;j<=cend && count<=elements;j++){
                arr[rstart][j]=count;
                count++;
            }
            rstart++;
              for(int j=rstart;j<=rend && count<=elements;j++){
                arr[j][cend]=count;
                count++;
            }
            cend--;
            for(int j=cend;j>=cstart && count<=elements;j--){
                arr[rend][j]=count;
                count++;
            }
            rend--;
            for(int j=rend;j>=rstart && count<=elements;j--){
                arr[j][cstart]=count;
                count++;
            }
            cstart++; 
        }
        return arr;
    }
}