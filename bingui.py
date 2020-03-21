class Solution:
    def bingui(self,array):
        mid = len(array) /2
        # 一个不需要
        self.sorted(array[:mid+1],array[mid+1:])
    def sorted(self,num1,num2):
        index = 0
        list1 = []
        i=j=0
        while(num1[i]<=num2[j]):
            list1[index] = num1[1]
            #python中没有++哦
            #因为是
