class Solution:
    def levelOrder(self,root):
        if not root:
            return  []
        data = []
        count = 2#根节点是第一行 然后判断的是第二行
        #count 为偶数就是从左往右加 否则就是从右往左加
        deque = [root]
        while deque:
            resutl = []
            child = []
            for i in deque:
                resutl.append(i.val)
                if(count % 2 !=0):
                    if i.left:
                        child.append(i.left)
                    if i.right:
                        child.append(i.right)

                else :
                    if i.right:
                        child.append(i.right)
                    if i.left:
                        child.append(i.left)

            data.append(resutl)
            deque = child
            count+=1
        return  data


