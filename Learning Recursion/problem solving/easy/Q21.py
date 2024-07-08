def findClosing(c):
    if (c == '('):
        return ')'
    if (c == '{'):
        return '}'
    if (c == '['):
        return ']'
    return None
 
def check(expr):
    n = len(expr)
 
    # Base cases
    if (n == 0):
        return True
    if (n == 1):
        return False
    if (expr[0] == ')' or expr[0] == '}' or expr[0] == ']'):
        return False
 
    # Search for closing bracket for first
    # opening bracket.
    closing = findClosing(expr[0])
 
    # count is used to handle cases like
    # "((()))". We basically need to
    # consider matching closing bracket.
    i, count = 1, 0
    while i < n:
        if (expr[i] == expr[0]):
            count += 1
        if (expr[i] == closing):
            if (count == 0):
                break
            count -= 1
        i += 1
 
    # If we did not find a closing
    # bracket
    if (i == n):
        return False
 
    # If closing bracket was next
    # to open
    if (i == 2):
        return check(expr[i:n-1])
    # If closing bracket was somewhere
    # in middle.
    return check(expr[1:i]) and check(expr[i+1:n])

print(check("[()]{}{[()()]()}"))