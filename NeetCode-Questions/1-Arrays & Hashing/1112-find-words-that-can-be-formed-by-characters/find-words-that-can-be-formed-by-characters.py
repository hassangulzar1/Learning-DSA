class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        charMap = {}
        for i in chars:
            charMap[i] = 1 + charMap.get(i,0)
        
        ans = 0
        for string in words:
            currMap = charMap.copy()
            add = 0
            for ch in string:                
                if ch in currMap and currMap[ch] > 0:  
                  currMap[ch] -= 1
                  add += 1
                else:
                    add = 0
                    break     

            ans += add   
        return ans
            

        