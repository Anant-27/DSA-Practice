class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(!contains(i) && !contains(j)){
                    if(i+j==n){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static boolean contains(int n){
        while(n>0){
            if(n%10==0){
                return true;
            }
            n=n/10;
        }
        return false;
    }
}
