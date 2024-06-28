class Solution:
    def reverseVowels(self, s: str) -> str:
        vovels = ['a','e','i','o','u','A','E','I','O','U']
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