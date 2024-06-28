class Solution:
    def reverseVowels(self, s: str) -> str:
        
        vovels = {'a': 0, 'e': 0, 'i': 0, 'o': 0, 'u': 0, 'A': 0, 'E': 0, 'I': 0, 'O': 0, 'U': 0}
        
        sList = list(s)
        s = 0
        e = len(sList)-1

        while s < e:
            if sList[s] in vovels and sList[e] in vovels:
                temp = sList[s]
                sList[s] = sList[e]
                sList[e] = temp
                s += 1
                e -= 1

            if sList[s] not in vovels:
                s += 1
            if sList[e] not in vovels:
                e -= 1

        return "".join(sList)