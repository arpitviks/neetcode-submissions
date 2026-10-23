class Solution {

    public String encode(List<String> strs) {
         StringBuilder sb =  new StringBuilder();
        for(String str : strs){  
            sb.append(str.length()).append("#").append(str);                      
        }
        System.out.println("encoded "+sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {                    
        List<String> ansList = new ArrayList<>();
        int i =0;        
        String strLen;
        int len;
        while(i< str.length()){            
            strLen = "";
            while(str.charAt(i) != '#'){
                strLen+=str.charAt(i);
                i++;
            }
            len = Integer.valueOf(strLen);
            ansList.add(str.substring(i+1,i+len+1));
            i = i+len+1;
        }
        return ansList;
    }
}
