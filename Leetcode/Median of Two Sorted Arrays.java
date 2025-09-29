class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int low=0;
        int high=nums1.length;
        int total=(nums1.length+nums2.length);
        int half=(total+1)/2;

        while(low <= high){
            int mid1=low+(high-low)/2;
            int mid2=half-mid1;

            int mid1x=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int mid1y=(mid1==nums1.length)?Integer.MAX_VALUE:nums1[mid1];

            int mid2x=(mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];
            int mid2y=(mid2==nums2.length)?Integer.MAX_VALUE:nums2[mid2];
            
            if(mid1x <= mid2y && mid1y >= mid2x){
                double ans;
                if(total % 2==0){
                    ans=(Math.max(mid1x,mid2x)+Math.min(mid1y,mid2y))/2.0;
                }
                else{
                    ans=(Math.max(mid1x,mid2x))/1.0;
                }
                return ans;
            }
            else if(mid1x > mid2y){
                high=mid1-1;
            }
            else if(mid2x > mid1y){
                low=mid1+1;
            }
        }
        return (double)0;
    }
}
