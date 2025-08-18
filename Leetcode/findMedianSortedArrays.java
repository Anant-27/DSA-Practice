class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length +nums2.length]; 
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        int n = result.length;
        if (n % 2 == 1) {
            return result[n / 2]; 
        } else {
            return (result[n / 2] + result[n / 2 - 1]) / 2.0; 
        }
    }
}
