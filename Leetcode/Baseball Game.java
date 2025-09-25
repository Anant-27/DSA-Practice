class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String str=operations[i];

            if(str.equals("C")){
                st.pop();
            }
            else if(str.equals("D")){
                st.push(st.peek()*2);
            }
            else if(str.equals("+")){
                int top=st.pop();
                int score=top+st.peek();
                st.push(top);
                st.push(score);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        for(int i=0;i<st.size();i++){
            sum+=st.get(i);
        }
        return sum;
    }
}
