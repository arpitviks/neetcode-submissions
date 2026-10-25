class Solution {
    public int longestConsecutive(int[] nums) {        

        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            numsSet.add(num);
        }
        int longest = 0;
        int currrLongest = 0;
        for(int n : nums){                        
            if(!numsSet.contains(n - 1)){
                currrLongest = 1;
                int currNum = n+1;
                while(numsSet.contains(currNum)){
                    currrLongest++;
                    currNum++;
                }
                if(currrLongest > longest){
                    longest = currrLongest;
                }
            }
        }
        return longest;
        
    }
}