class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> countMap= new HashMap<Integer,Integer>();
        int sum =0;
        int[] ansArr = {0,0};
        for(int i = 0;i<nums.length;i++){            
                sum = target - nums[i];
                if(countMap.containsKey(sum)){
                    ansArr[0] = countMap.get(sum);
                    ansArr[1] = i;
                    return ansArr;
                } else{
                    countMap.put(nums[i], i);
                }             
        }
        
        return new int[0];
    }
}