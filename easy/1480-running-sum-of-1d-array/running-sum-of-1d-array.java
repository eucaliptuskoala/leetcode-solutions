class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        // int[] sums = new int[]; // Java does not allow dynamic array sizing, so this would not work
        int runningSum = 0;
        sums[0] = runningSum;
        for (int i=0; i<nums.length; i++){
            runningSum += nums[i];
            sums[i] = runningSum;
        }
        return sums;
    }
}