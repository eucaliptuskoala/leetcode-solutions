/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let sums = [];
    let runningSum = nums[0];
    sums[0] = runningSum;
    for(let i = 1; i<nums.length; i++){
        runningSum += nums[i];
        sums.push(runningSum);
    }
    return sums
};

// solution using map
var runningSum = function(nums) {
    let runningSum = nums[0];
    return nums.map((num) => runningSum += num);
};

