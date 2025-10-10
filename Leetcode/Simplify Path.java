class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] tokens=path.split("/");
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals(".") || tokens[i].equals("")){
                continue;
            }
            if(tokens[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(tokens[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String words:st){
            sb.append("/").append(words);
        }
        if(sb.length()==0){
            return "/";
        }
        return sb.toString();
    }
}
