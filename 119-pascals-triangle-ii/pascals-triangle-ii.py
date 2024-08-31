class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        res = [[1]]

        for i in range(rowIndex):
            curr = [0] + res[-1] + [0]
            ans = []

            for j in range(len(curr) - 1):
                ans.append(curr[j]+curr[j + 1])
            res.append(ans)
        return res[rowIndex]

        