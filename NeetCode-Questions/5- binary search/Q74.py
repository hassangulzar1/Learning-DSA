matrix = [[1]]
target = 0


def findRow(matrix , target):
    s = 0
    e = len(matrix) - 1
    n = len(matrix[0]) - 1
    while s <= e:
        mid = (s + e) // 2

        if matrix[mid][0] <=  target  <= matrix[mid][n]:
            return mid
        elif matrix[mid][n] < target:
            s = mid + 1
        else:
            e = mid -1
    return -1

particularArr = findRow(matrix,target)

def binarySearch(arr,target):
    s = 0
    e = len(arr) -1
    while s <= e:
        mid = (s + e) // 2 
        if arr[mid] == target:
              return True
        elif arr[mid] < target:
            s = mid + 1
        else:
            e = mid - 1
    return False

if particularArr == -1:
    print(False)


    
print( binarySearch(matrix[particularArr],target))
        

