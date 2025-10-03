class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        int prevStart=intervals[0][0];
        int prevEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int currStart=intervals[i][0];
            int currEnd=intervals[i][1];
            if(currStart<=prevEnd){
                prevEnd=Math.max(prevEnd,currEnd);
            }
            else{
                ans.add(new int[]{prevStart,prevEnd});
                prevStart=currStart;
                prevEnd=currEnd;
            }
        }
        ans.add(new int[]{prevStart, prevEnd});
        return ans.toArray(new int[ans.size()][]);
    }
}
