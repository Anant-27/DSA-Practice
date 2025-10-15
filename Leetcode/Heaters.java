class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int n=houses.length;
        int low=0;
        int high=Integer.MAX_VALUE/2;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(houses,heaters,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] houses,int[] heaters,int mid){
        int idx=0;
        int i=0;
        while(idx<houses.length && i<heaters.length){
            int val=heaters[i];
            if(Math.abs(val-houses[idx])<=mid){
                idx++;
            }
            else if(val+mid < houses[idx]){
                i++;
            }
            else{
                return false;
            }
        }
        return idx==houses.length;
    }
}
