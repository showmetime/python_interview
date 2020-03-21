class QuickSort:
    def quick_sort(self,data):
        #data是列表
        if len(data) >=2:
            #注意 这里是入口
            left,right  =[],[]
            mid = data[len(data) // 2]
            data.remove(mid)
            for i in data:
                if(i<= mid):
                    left.append(i)
                else:
                    right.append(i)
            return self.quick_sort(left) + [mid] + self.quick_sort(right)
        else:
            return data

count =    QuickSort()
print(count.quick_sort([2,3,5,7,1,4,6,15,5,2,7,9,10,15,9,17,12]))