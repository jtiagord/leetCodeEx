class Solution {
    public int lengthOfLongestSubstring(String s) {
        int currentBest = 0;
        int current = 0;
        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            for(int j = 1;j <= current; j++){
                char compChar = s.charAt(i-j);
                if(compChar == currChar){
                    if(current > currentBest) currentBest = current;
                    current = j-1;
                }
            }
            current ++;
        }
        
        return current > currentBest ? current : currentBest;
    }
}