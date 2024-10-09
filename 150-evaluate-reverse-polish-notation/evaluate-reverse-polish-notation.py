class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        integerStack = []

        for val in tokens:
          if val == "+":
             integerStack.append(integerStack.pop() + integerStack.pop())

          elif val == "-":
             val1,val2= integerStack.pop(),integerStack.pop()
             integerStack.append(val2-val1)

          elif val == "*":
             integerStack.append(integerStack.pop() * integerStack.pop())

          elif val == "/":
             val1,val2= integerStack.pop(),integerStack.pop()
             integerStack.append(int(val2/val1) )

          else:
             integerStack.append(int(val))
             

        return integerStack[0]