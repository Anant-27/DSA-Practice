class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int max=0;
        for(int start=0;start<n;start++){
            HashMap<Character,Integer> freq=new HashMap<>();
            for(int end=start;end<n;end++){
                char ch=s.charAt(end);
                freq.put(ch,freq.getOrDefault(ch,0)+1);

                if(isEqual(freq)){
                    max=Math.max(max,end-start+1);
                }
            }
        }
        return max;
    }
    public boolean isEqual(HashMap<Character,Integer> freq){
        int val=-1;
        for(int f:freq.values()){
            if(val==-1){
                val=f;
            }
            else if(val!=f){
                return false;
            }
        }
        return true;
    }
}
