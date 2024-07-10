class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        maping = [0]*26

        for i in s:
            maping[ord(i)- ord("a")] += 1
        
        for i in t:
            maping[ord(i)- ord("a")] -= 1
        
        for i in range(26):
            if maping[i] != 0:
                return False
        return True
        
        
      
        


        

        

        
        
