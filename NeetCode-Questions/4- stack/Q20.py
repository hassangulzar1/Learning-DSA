s = "]"

stack = []

for i in range(len(s)):
    if s[i] == "(":
        stack.append(")")
    elif s[i] == "{":
        stack.append("}")
    elif s[i] == "[":
        stack.append("]")
    else:
        if len(stack) == 0 or stack[-1] != s[i]:
              return False
        else:
            stack.pop()
print(stack)