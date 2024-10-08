class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        openToCLose = {")":"(", "}": "{", "]": "[" }

        for c in s:
            if c in openToCLose:
                if stack and stack[-1] == openToCLose[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)

        return True if not stack else False
