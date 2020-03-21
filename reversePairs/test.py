class solution:
    def reversePairs(self,nums):

        class Tree:
            def __init__(self,n):
                self.size = n
                self.tree = [0] * (n+1)

            def __lowbit(self,index):
                #这个取最低位1的方法 就是树状数组很厉害的地方
                return index & (-index)

            def update(self,index,delta):
                #delta是要对这个值加多少
                while(index<=self.size):
                    self.tree[index] +=delta
                    index += self.__lowbit(index)
            def query(self,index):
                sum_data = 0
                #查询只需要查index-1的位置就行了
                while(index>0):
                    sum_data += self.tree[index]
                    index -= self.__lowbit(index)
            # 对 当长度只有两个的时候 直接返回
        if len(nums)<2:
            return 0

        import heapq
        rank_map = {}
        rank = 1
        data = list(set(nums))#去重再list
        heapq.heapify(data)#转化为堆结构就已经排好序了
        for i in range(len(data)):
            #将最小得rank置为1
            num = heapq.heappop(i) #pop的是最小的，而且是升序排列的
            rank_map[num] = rank
            rank += 1

        result = 0
        tree = Tree(len(data))#注意这里是去重之后的长度
        #接下来就是真正的比较了
        for i in range(len(nums)):
           rank = rank_map[nums[i]]#这个是这个数组的排名
           tree.update(rank,1)










