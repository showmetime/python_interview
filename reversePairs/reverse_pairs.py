class Solution:
    def reversePairs(self,nums):
        self.cnt = 0
        #这个就是这个类的cnt了 注意这种写法 及规定
        def merge(nums,start,mid,end,temp):
            # 现在是再这里进行排序
            i,j= start,mid+1
            while i<=mid and j<=end:
                if nums[i]>nums[j]:
                    #前面的比后面的大
                    self.cnt += mid-i+1
                    temp.append(nums[j])
                    j+=1
                else:
                    temp.append(nums[i])
                    i+=1

            while j<=end:#这里或者是j<end  注意啊 用i>end的话就一直是true所以 j一直+=1所以肯定会越界啊啊
                #当前面的数组用完了 temp的数组直接排 后面的j的数组好了
                temp.append(nums[j])
                j+=1
            while i<=mid:#这里或者是i<mid
                #后面的数组用完了直接将前面的加上啊
                temp.append(nums[i])
                i+=1
            for i  in range(len(temp)):
                nums[i+start] = temp[i]
                #将这些nums排为有序的去 注意这里是start+i
            temp.clear()
        def mergerSort(nums,start,end,temp):
            if start == end:
                return
            #直接return  或者就是0
            mid = (start+end)>>1
            #python没有>>>无符号右移
            mergerSort(nums,start,mid,temp)
            #先递归到只有一个数字
            mergerSort(nums,mid+1,end,temp)
            merge(nums,start,mid,end,temp)
        #注意 内嵌函数必须要调用才可以
        mergerSort(nums,0,len(nums)-1,[])
        return self.cnt

data = Solution()
print(data.reversePairs([5,4,2,1,3]))





