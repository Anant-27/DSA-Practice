class Solution {
    public long removeZeros(long n) {
        String s=Long.toString(n);
        s=s.replace("0","");
        long num=Long.parseLong(s);
        return num;
    }
}
