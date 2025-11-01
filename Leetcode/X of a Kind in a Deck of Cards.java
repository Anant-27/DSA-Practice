class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<2){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:deck){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int gcd=0;
        for(int freq:map.values()){
            gcd=helper(gcd,freq);
        }
        return gcd>=2;
    }
    public int helper(int a,int b){
        if(b==0){
            return a;
        }
        return helper(b,a%b);
    }
}
