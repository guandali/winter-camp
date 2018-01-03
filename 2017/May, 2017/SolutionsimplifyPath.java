public class SolutionsimplifyPath {
    public String simplifyPath(String path) {
        Stack st = new Stack();
        String ans = "";
        if (path == null || path.length() == 0){
            return "/";
        }
        String [] list = path.split("/+");
        if(list.length == 0){
            ans = "/";
        }
        else {
            int i = 0;
            while (i < list.length){
                if(list[i].equals("..") && (!st.empty()) ){
                    st.pop();
                }
                else if (!list[i].equals("..") && !list[i].equals(".") && !list[i].equals("")  ){
                    st.push(list[i]);
                }
                i++;
            }
        if( st.empty()){
            ans = "/";
         }
        else {
            while(! st.empty()){
            ans = "/"+ st.pop() + ans ;
            }
         }
        }


        
        return ans;
    }
}