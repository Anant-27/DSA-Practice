class Solution {
    public boolean scoreBalance(String s) {
       int n=s.length();
        int score=0;
        for(int i=0;i<n;i++){
            score+=s.charAt(i)-'a'+1;
        }
        int lsum=0;
        int rsum=0;
        for(int i=0;i<n-1;i++){
            lsum+=s.charAt(i)-'a'+1;
            rsum=score-lsum;
            if(lsum==rsum){
                return true;
            }
        }
        return false;
    }
}
