class PrintTree:
    def levelOrder(self,root):
        if not root:
            return []
        deque = [root]
        result = []
        while deque:
            out = []
            temp = []
            for i in deque:
                temp.append(i.val)
                if i.left:
                    out.append(i.left)
                if i.right:
                    out.append(i.right)
            result.append(temp)
            deque = out
        return result





class TreeNode(object):
    def __init__(self,x):
        self.val = x
        self.left = None
        self.right = None
