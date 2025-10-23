class Solution {
    public int reachNumber(int target) {
        int sum=0;
        int moves=0;
        target = Math.abs(target);
        while(sum<target){
            moves++;
            sum=sum+moves;
        }
        while((sum-target)%2==1){
            moves++;
            sum=sum+moves;
        }
        return moves;
    }
}
