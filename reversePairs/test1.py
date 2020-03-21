class Tree:
    def __init__(self, n):
        self.size = n
        self.tree = [0] * (n + 1)

    def __lowbit(self, index):
        # 这个取最低位1的方法 就是树状数组很厉害的地方
        return index & (-index)

    def update(self, index, delta):
        # delta是要对这个值加多少
        while (index <= self.size):
            self.tree[index] += delta
            index += self.__lowbit(index)

    def query(self, index):
        sum_data = 0
        # 查询只需要查index-1的位置就行了
        while (index > 0):
            sum_data += self.tree[index]
            index -= self.__lowbit(index)
        return  sum_data
data = Tree(10)
data.update(5,1)
print(data.tree)
print(data.query(4))
