// Last updated: 12/08/2026, 20:32:15
    class Solution {
    public String removeDuplicates(String s){
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
              if(!st.isEmpty()&&c==st.peek())
                  st.pop();
              else
                  st.push(c);
                  
              }
        StringBuilder sb=new StringBuilder();
        for(char ch:st)
            sb.append(ch);
            return sb.toString();
        
    }
}
              