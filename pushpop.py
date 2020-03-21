class Solution(object):
    def validate(self,pushed,poped):
        # 我当初想的是直接在这个数组上面改 但是好像不行啊  再试一下 别的都是重新用了一个数组
        '''
        好像不行 就是应该重新用一个列表模拟出栈和入栈
        '''
        if(len(pushed)!=len(poped)):
            return  False
        list =[]
        popindex = 0
        for i in pushed:
            list.append(i)
            while(len(list)>0 and list[-1]==poped[popindex]):
                # 这个列表的最后一个等于poped的第一个就将其pop掉
                # 哦 不加这个len(list)>0的话 list为空他还会继续判断 导致报错 ！！
                list.pop()
                popindex+=1
        print(list)
        return  len(list) ==0


func = Solution()
data = func.validate([1,2,3,4,5],[4,5,3,2,1])
print(data)
