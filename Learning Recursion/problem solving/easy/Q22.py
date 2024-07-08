S="aaaaabbbbbb"

def removeDup(s):
    i = 0
    j = 0
 

    str = ""
    while j < len(s):
        if s[i]  ==  s[j]:
            j += 1
        elif (s[i] != s[j]) or( j==len(s)-1):
            str += s[i]
            i = j
            j += 1

    str+=s[j-1]

    return str

print(removeDup(S))

    

