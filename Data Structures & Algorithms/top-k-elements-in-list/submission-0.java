class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> ansMap = new HashMap<Integer,Integer>();
        List<Integer>[] freqArr = new List[nums.length + 1];

        for(int i = 0;i<freqArr.length;i++){
            freqArr[i] = new ArrayList<>();
        }
        for(Integer num :  nums){
            ansMap.put(num, ansMap.getOrDefault(num, 0) + 1);
        }    
        for(int num : ansMap.keySet()){
            freqArr[ansMap.get(num)].add(num);
        }  
        int[] res = new int[k];
        for(int i=freqArr.length - 1, index = 0;i>0 && index < k;i--){

            for(int num : freqArr[i]){
                res[index++] = num;
                if(index == k){
                    return res;
                }
            }
        }
        return res; 
    }
}
