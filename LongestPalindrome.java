//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set= new HashSet<>();
        int result=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                result=result+2;
                set.remove(c);
                
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            result++;
        }
        return result;
    }
}
