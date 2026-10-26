class CustomStack{
        public String ele;
        public List<String> stackList;

        public CustomStack(){
            stackList = new ArrayList<>();
        }

        public Integer size(){
            return this.stackList.size();
        }
        public Boolean push(String element){
            this.stackList.add(element);
            return true;
        }
        public Boolean pop(){
            if(this.stackList.size() > 0){
                this.stackList.remove(stackList.size() - 1);
                return true;
            }
            return false;
        }
        public String top(){
            if(this.stackList.size() > 0){
                return this.stackList.get(stackList.size() - 1);
            }
            return null;
        }
    }
class Solution {    
    public boolean isValid(String s) {
        CustomStack customStack = new CustomStack();
        Map<Character, Character> bracketMap = Map.of(')', '(', '}', '{', ']', '[');
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                //System.out.println("push"+s.charAt(i));
                customStack.push(String.valueOf(s.charAt(i)));
                //System.out.println(customStack.size());
            }  else if(s.charAt(i) == '}' && customStack.top() != null && (customStack.top()).equals("{")){
                System.out.println("pop"+s.charAt(i));
                customStack.pop();
            } else if(s.charAt(i) == ')' && customStack.top() != null && (customStack.top()).equals("(")){
                //System.out.println("pop"+s.charAt(i));
                customStack.pop();
            } else if(s.charAt(i) == ']' && customStack.top() != null && (customStack.top()).equals("[")){
                //System.out.println("pop"+s.charAt(i));
                customStack.pop();
            } else return false;
        }
        //System.out.println(customStack.size());
        if(customStack.size() != 0){
            return false;
        }
        return true;

        //System.out.println(customStack.top());
        
    }
}
