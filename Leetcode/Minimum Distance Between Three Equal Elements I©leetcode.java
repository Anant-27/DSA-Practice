class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(ArrayList<Integer> list:map.values()){
            if(list.size()>=3){
                for(int i=0;i+2<list.size();i++){
                    int left=list.get(i);
                    int right=list.get(i+2);
                    ans=Math.min(ans,2*(right-left));
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}©leetcode
