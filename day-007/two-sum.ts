function twoSum(nums: number[], target: number): number[] {
    const result = new Array<number>()
    for (let i = 0; i < nums.length - 1; i++){
        for (let j = i + 1; j < nums.length; j++){
            if(nums[i] + nums[j] === target){
                result.push(i)
                result.push(j)
                break
            }
        }
        if(result.length === 2) break
    }
    return result
};