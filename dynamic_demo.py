
def coinChange(coins,amount):
    # 运行dp的时候 会直接运行里面的函数
    def  dp(n):
        # 最开始的 为负没法表示
        if(n==0):
            return 0
        if(n<0):
            return  -1
        res = float("INF")
        #这个是正无穷
        for coin in coins:
            subproblem = dp(n-coin)

            if(subproblem ==-1):
                continue
            res = min(res,1+subproblem)
            # subproblem是11-5 的最小次数 加1是增加了一次 
            print(res)

        return  res if res!=float("INF") else  -1

    return  dp(amount)


if __name__ == "__main__":
    data = coinChange([1],5)
    print("data",data)



