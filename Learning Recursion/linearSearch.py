myArr = [23,3,2,4,3,5,73,34,8,1]

def linearSearch(arr,i,tar):
    if i == len(arr):
        return False
    
    
    
    return myArr[i] == tar or linearSearch(arr,i+1,tar)

    

print(linearSearch(myArr,0,1))