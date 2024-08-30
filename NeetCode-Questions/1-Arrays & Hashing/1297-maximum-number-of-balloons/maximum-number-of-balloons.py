class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        charText = Counter(text)
        balloon = Counter("balloon")
        res = len(text)

        for c in balloon:
            res = min(res, charText[c] // balloon[c])
        return res


        