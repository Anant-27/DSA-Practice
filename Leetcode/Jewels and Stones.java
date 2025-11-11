class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char ans=stones.charAt(i);
            if(jewels.indexOf(ans)>=0){
                count++;
            }
        }
        return count;
    }
}
