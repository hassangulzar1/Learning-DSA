res = []
s = "nitin"
ind = 0
curr = []

def checkPalidrom(s):
    i,j = 0, len(s) - 1

    while i < j:
        if s[i] != s[j]:
            return False
        i += 1
        j -=1
    
    return True

def partition(s,curr,res,ind):
    if ind == len(s):
        res.append(list(curr))
        return

    temp = ""

    for i in range(ind,len(s)):
        temp += s[i]
        if checkPalidrom(temp):
            curr.append(temp)
            partition(s,curr,res,i+1)
            curr.pop()

partition(s,curr,res,ind)

print(res)
