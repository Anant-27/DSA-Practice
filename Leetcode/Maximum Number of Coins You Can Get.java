class Solution {
    public int maxCoins(int[] piles) {
      Arrays.sort(piles);
      int left=0;
      int right=piles.length-1;
      int ans=0;
      while(left<right){
        right--;
        ans+=piles[right--];
        left++;
      } 
      return ans; 
    }
}
