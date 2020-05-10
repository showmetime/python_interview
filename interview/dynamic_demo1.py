import numpy as np
def coinChange(coins,amount):
    def  dp(n):
        # 最开始的 为负没法表示
        data = np.zeros(n+1,dtype=int)
        data[0] = 0
        # 现在是用data[i]表示为i需要的最少次数 它也是i-1的次数加一就行了
        for coin in coins:
            for i in range(1,n+1):
                if(i-coin>=0):
                    data[i] = 1 + data[i-coin]
                    print(data[i])
        return data[n]
        #先返回到这个函数这里
    return dp(amount)
        #接着这个函数调用



if __name__ == "__main__":
    data = coinChange([1,2,5],13)
    print("data",data)

