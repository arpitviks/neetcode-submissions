
class Solution {
    public boolean isAnagram(String s, String t) {
        int n;      
        int arr[] = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }  
        //System.out.println("---"+arr[0]+"---"+arr[1]);
        for(char ch : s.toCharArray() ){
            n = (Integer)((ch) % 97);
            arr[n]++;            
        }
        for(char ch : t.toCharArray() ){
            n = (Integer)((ch) % 97);
            arr[n]--;
        }
        for(int i =0;i<26;i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
