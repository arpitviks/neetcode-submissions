class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ansList = new ArrayList<List<String>>();
        HashMap<String, List<String>> ansMap = new HashMap<String, List<String>>();
        List<String> subList;
        for(int i = 0;i<strs.length;i++){  
            char[] charStr = strs[i].toCharArray();
            Arrays.sort(charStr);
            String sortedKey = String.valueOf(charStr);


            if(!ansMap.containsKey(sortedKey)){
                subList = new ArrayList<String>();
                subList.add(strs[i]);
                ansMap.put(sortedKey,new ArrayList<>());
            } 
            ansMap.get(sortedKey).add(strs[i]);     
        }
         return new ArrayList<>(ansMap.values());
    }
}