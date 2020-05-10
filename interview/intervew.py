class Solution:
    def waysToChange(self, n):
        d = [1] + [0] * n
        # 这个是列表
        for c in (1, 5, 10, 25):
            for i in range(n - c + 1):
                print(i)
                #0-5 0
                d[i + c] += d[i]
                print(d)
        print( d[n])
n = Solution();
n.waysToChange(5)
