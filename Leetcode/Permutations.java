class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(nums,visited,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int[] nums,boolean[] visited,List<Integer> sublist,List<List<Integer>> ans){
        if(sublist.size()==nums.length){
            ans.add(new ArrayList<>(sublist));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            sublist.add(nums[i]);
            helper(nums,visited,sublist,ans);
            sublist.remove(sublist.size()-1);
            visited[i]=false;;
        }
    }
}
