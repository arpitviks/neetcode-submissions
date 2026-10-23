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
        int j=0;
        String strLen;
        int len;
        while(i< str.length()){
            j=i;
            strLen = "";
            while(str.charAt(j) != '#'){
                strLen+=str.charAt(j);
                j++;
            }
            len = Integer.valueOf(strLen);
            ansList.add(str.substring(j+1,j+len+1));
            i = j+len+1;
        }
        return ansList;
    }
}
