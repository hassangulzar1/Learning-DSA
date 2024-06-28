class Solution:
    def removeStars(self, s: str) -> str:
        myStr = ""

        for i in s:
            if i == "*":
                myStr = myStr[0:len(myStr) - 1]
            else:
                myStr += i
        return myStr
