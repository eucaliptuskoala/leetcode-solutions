class Solution(object):
    def runningSum(self, nums):
        sums = [0]*len(nums)
        # sums = [] # python reserves memory for each element in the list, so this would work, but is less efficient
        runningSum = nums[0]
        sums[0] = runningSum
        for i in range (1, len(nums)):
            runningSum += nums[i]
            sums[i] = runningSum
        return sums