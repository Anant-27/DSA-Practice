class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> ll=new ArrayList<>();
        int ones=1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                ll.add(digit*ones);
            }
            n/=10;
            ones*=10;
        }
        Collections.sort(ll,Collections.reverseOrder());

        int[] ans=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            ans[i]=ll.get(i);
        }
        return ans;
    }
}
