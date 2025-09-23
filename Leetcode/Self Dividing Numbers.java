class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ll=new ArrayList<>();
        for(int num=left;num<=right;num++){
            if(selfDividing(num)){
                ll.add(num);
            }
        }
        return ll;
    }

    public static boolean selfDividing(int num){
        int temp=num;

        while(temp>0){
            int rem=temp%10;
            if(rem==0 || num%rem!=0){
                return false;
            }
            temp/=10;
        }
        return true;
    }
}
