class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]

        for row in range(numRows - 1):
            temp = [0] + res[-1] + [0]
            ans = []

            for j in range(len(res[-1]) + 1):
                ans.append(temp[j] + temp[j + 1])
            
            res.append(ans)

        return res



        