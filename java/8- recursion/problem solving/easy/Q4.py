str ="geekS"

def firstUpperCase(s):
    if s[len(s)-1].isupper():
        return s[len(s)-1]
    
    return firstUpperCase(s[:len(s)-1])

print(firstUpperCase(str))
    
