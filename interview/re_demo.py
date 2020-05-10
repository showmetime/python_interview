import re

class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        str = str.lstrip()
        data = re.compile('^[\+\-\d]|\d+')
        #他妈的这个是[]括号 不在是（）了
        content = data.findall(str)
        print(content)
        if(len(content)==0):
            print(0)
        else:
            print(max(min(int(*content),2**31-1),-2**31))
            # 解包 也就是穿过来的参数 *就是迭代 **就是字典的传入



number = Solution()
number.myAtoi("2dada")