myArr = [1,2,3,5,4]

def isSorted(i,arr):
  if i == len(arr) - 1:
    return True
  
  return arr[i] < arr[i + 1] and isSorted(i + 1 , arr)

print(isSorted(0,myArr))