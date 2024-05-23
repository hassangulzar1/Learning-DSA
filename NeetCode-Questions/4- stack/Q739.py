temperatures = [73,74,75,71,69,72,76,73]

res = [0] * len(temperatures)
stack = []

for i,t in enumerate(temperatures):
    while stack and t > stack[-1][0]:
        print(stack[-1][0])
        stackT,stackIn = stack.pop()
        res[stackIn] = i - stackIn
    stack.append([t,i])

print(res)