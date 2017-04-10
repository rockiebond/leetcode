class Solution(object):
    """The solution """
    def findComplement(self, num):
        i = 1
        while i <= num:
            i = i << 1
        return (i - 1) ^ num

obj = Solution()
print(obj.findComplement(4))
