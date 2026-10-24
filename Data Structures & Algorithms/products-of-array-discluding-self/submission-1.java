class Solution {
    public int[] productExceptSelf(int[] nums) {
            int[] prefixArr = new int[nums.length];
            int[] sufixArr = new int[nums.length];
            int[] ansArr = new int[nums.length];
            
            prefixArr[0] = nums[0];
            sufixArr[nums.length - 1] = nums[nums.length - 1];

            for(int i =1; i<prefixArr.length; i++){
                prefixArr[i] = nums[i] * prefixArr[i-1];
                
            }
            for(int j = nums.length - 2; j>-1; j--){
                sufixArr[j] = sufixArr[j+1] * nums[j];
            }
            // for(int i = 0; i < prefixArr.length; i++){
            //     System.out.print("--"+prefixArr[i]);                
            // }
            // System.out.println("");                
            // for(int i = 0;i<sufixArr.length;i++){
            //     System.out.print("=="+sufixArr[i]);                
            // }  
            for(int i = 0; i < nums.length; i++){
                ansArr[i] = (i == 0) ? sufixArr[i+1] : (i == nums.length - 1) ? (prefixArr[i-1]) : (prefixArr[i-1] * sufixArr[i+1]);
            }
            return ansArr;
        }        
    }  