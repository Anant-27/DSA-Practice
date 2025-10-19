class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
            for(int num:nums){
            set.add(num);
        }

        int val=k;
        while(true){
            if(!set.contains(val)){
                return val;
            }
            val+=k;
        }
    }
}
