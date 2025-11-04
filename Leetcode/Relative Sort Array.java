class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ll=new ArrayList<>();
        for(int val:arr2){
            if(map.containsKey(val)){
                int count=map.get(val);
                for(int i=0;i<count;i++){
                    ll.add(val);
                }
                map.remove(val);
            }
        }
        List<Integer> remain=new ArrayList<>(map.keySet());
        Collections.sort(remain);
        for(int val:remain){
            int count=map.get(val);
            for(int i=0;i<count;i++){
                ll.add(val);
            }
        }
        int[] ans=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            ans[i]=ll.get(i);
        }
        return ans;
    }
}
