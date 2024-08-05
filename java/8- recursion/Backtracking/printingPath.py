def count (p,r,c):
    if r == 1 and c ==1:
        return [p]
    
    localList = []

    if r > 1:
      localList.extend(count(p + "D",r - 1, c))

    if c > 1:       
      localList.extend(count(p + "R",r, c - 1))

    return localList

print(count("",3,3))