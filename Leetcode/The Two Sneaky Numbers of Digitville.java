class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       List<Integer> ll=new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==2){
                ll.add(entry.getKey());
            }
       }
       int[] arr=new int[ll.size()];
       for(int i=0;i<ll.size();i++){
            arr[i]=ll.get(i);
       }
        return arr;
    }
}
