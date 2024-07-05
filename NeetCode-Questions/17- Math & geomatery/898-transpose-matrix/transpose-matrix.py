class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        ans = []
        row = len(matrix)
        col = len(matrix[0])

        for i in range(col):
            mat = []
            for j in range(row):
                mat.append(matrix[j][i])
            ans.append(mat)

        

        return ans


        