class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        totalCount = {}
        n = len(words)

        for string in words:
            for ch in string:
                totalCount[ch] = 1 + totalCount.get(ch,0)
        for key,count in totalCount.items():
            if count % n != 0:
                return False
        return True

        