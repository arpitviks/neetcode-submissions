class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int l= 0;
        int r= str.length() -1;

        while(l < r){
            while(l < r && !checkChar(str.charAt(l))){
                l++;
            } 
            while(r > l && !checkChar(str.charAt(r) )){
                r--;
            }
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean checkChar(char ch){
        return ( ch >= 'a' && ch <= 'z' ||
            ch >= 'A' && ch <= 'Z' ||
            ch >= '0' && ch <= '9');
    }
}
