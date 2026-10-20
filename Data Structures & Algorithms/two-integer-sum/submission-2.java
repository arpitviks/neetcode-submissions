class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> countMap= new HashMap<Integer,Integer>();                
        for(int i = 0;i<nums.length;i++){            
                
                if(countMap.containsKey(target - nums[i])){
                    return new int[]{countMap.get(target - nums[i]), i};                    
                } else{
                    countMap.put(nums[i], i);
                }             
        }
        
        return new int[]{};
    }
}