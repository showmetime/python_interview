import numpy as np
def fic(n):
    data  = np.zeros((n),dtype="int")
    data[0] = data[1]  = 1
    for i in range(2,n):
        data[i] = data[i-1] + data[i-2]
    return  data[n-1]
a = fic(10)
print(a)