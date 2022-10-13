class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            Integer complementIndex = hmap.get(target-x);
            if(complementIndex != null) return new int[]{i,complementIndex};
            hmap.put(x,i);
        }
        return null;
    }
}