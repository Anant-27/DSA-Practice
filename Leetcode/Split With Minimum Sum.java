class Solution {
    public int splitNum(int num) {
       String s=String.valueOf(num);
       int[] arr=new int[s.length()];
       for(int i=0;i<arr.length;i++){
        arr[i]=s.charAt(i)-'0';
       } 
       Arrays.sort(arr);
       int esum=0;
       int osum=0;
       for(int i=0;i<arr.length;i++){
            if(i%2==0){
                esum=esum*10 + arr[i];
            }
            else{
                osum=osum*10 + arr[i];
            }
       }
        return esum + osum;
    }
}
