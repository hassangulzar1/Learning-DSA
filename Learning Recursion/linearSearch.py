myArr = [23,3,2,4,3,5,73,34,8,1]


def linearSearch(arr,i,tar):
    l = []
    if i == len(arr):
        return l
    
    if myArr[i] == tar:
        l.append(i)
    
    
    allBelowAsns =  linearSearch(arr,i+1,tar)
    l = l + allBelowAsns
    
    return l

    

print(linearSearch(myArr,0,3))