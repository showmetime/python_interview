class Solution:
    def waysToChange(self, n):
        d = [1] + [0] * n
        # 这个是列表
        for c in (1, 5, 10, 25):  # 这个n刚好 大于或等于c
           for i in range(n - c + 1):
               # 先是0-10 在0-5 在0 对！ 负数好像不可以 ！
                print(i)

n = Solution()
n.waysToChange(10)