class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        col = set()
        posDiag = set()
        negDiag = set()

        res = []

        board = [["."] * n for i in range(n)]
        
        def Backtrack(r):
            if r == n:
                copy = ["".join(row) for row in board]
                res.append(copy)
                return
            
            for c in range(n) :
                if c in col or (c + r) in posDiag or (c - r) in negDiag:
                    continue
                
                col.add(c)
                posDiag.add(c + r)
                negDiag.add(c - r)
                board[r][c] = "Q"

                Backtrack(r + 1)

                col.remove(c)
                posDiag.remove(c + r)
                negDiag.remove(c - r)
                board[r][c] = "."

        Backtrack(0)
        return res

        