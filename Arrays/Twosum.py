class Solution(object):
    def twoSum(self, nums, target):
        a = len(nums)
        b=0
        for i in range (0,a):
            for j in range(i+1 , a):
                if nums[i] + nums[j] == target:
                    return [i,j]
                   
        
    
