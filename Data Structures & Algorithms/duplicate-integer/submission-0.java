class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        for(int n : nums){
            if(!countMap.containsKey(n) ){
                countMap.put(n,1);
            } else {
                return true;
            }
        }
        return false;
    }
}