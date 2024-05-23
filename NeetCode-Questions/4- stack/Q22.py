n = 3 

stack = []
res = []

def backtracking(openingN,closingN):
      if openingN == closingN == n:
         res.append("".join(stack))
         returnp
      if openingN < n:
         stack.append("(")
         backtracking(openingN +1,closingN)
         stack.pop()
      if openingN > closingN:
         stack.append(")")
         backtracking(openingN,closingN + 1)
         stack.pop()
backtracking(0,0)
# return res