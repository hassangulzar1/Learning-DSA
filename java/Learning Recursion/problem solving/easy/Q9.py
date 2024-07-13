str = "abcd"
def findLength(s):
    if s == "":
        return 0
    
    return 1 + findLength(s[1:])

print(findLength(str))