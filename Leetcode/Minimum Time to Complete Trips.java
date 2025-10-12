class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=1;
        int maxtime=0;
        for(int i=0;i<time.length;i++){
            if(time[i]>maxtime){
                maxtime=time[i];
            }
        }
        long right=maxtime*(long) totalTrips;
        long ans=right;
        while(left<=right){
            long mid=left+(right-left)/2;
            long trips=0;
            for(int i=0;i<time.length;i++){
                trips=trips + (mid/time[i]);
                if(trips>=totalTrips){
                    break;
                }
            }
            if(trips>=totalTrips){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
