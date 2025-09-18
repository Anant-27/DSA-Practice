class Solution {
    public int countSegments(String s) {
        if(s==null || s.trim().length()==0){
            return 0;
        }
        String str=s;
        String[] words=str.trim().split("\\s+");
        return words.length;
    }
}
