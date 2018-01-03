class SolutionFindDisappearedNumbers(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans = []
        for val in nums:
            idx = abs(val) - 1
            if nums[idx] > 0:
                nums[idx] = -nums[idx]
            
        for idx, val in enumerate(nums):
            if val > 0:
                ans.append(idx + 1)
        
        return ans
            
            
        