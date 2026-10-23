class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String str : strs){            
            encoded+= String.valueOf(str.length())+"#"+str;
        }
        System.out.println("encoded "+encoded);
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> ansList = new ArrayList<>();
        char[] charArr = str.toCharArray();        
        String numStr = "";
        int num;
        String subStr ="";        
        int i =0;
        while(i < charArr.length){
            numStr ="";
            while(charArr[i] != '#' && numStr != null){
                System.out.println("++"+numStr);
                numStr += charArr[i];
                i++;
            }
            ++i;
            System.out.println("=="+numStr);
            int currPtr = i + Integer.valueOf(numStr);
            subStr="";
            while(i< currPtr){
                subStr+= charArr[i];
                i++;
            }
            System.out.println("--"+subStr);
            ansList.add(subStr);
        
        }    
        return ansList;
    }
}
