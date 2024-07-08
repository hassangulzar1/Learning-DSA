exp = "[()]{}{[()()]()}"

def closing(c):
    if c == "(":
        return ")" 
    if c == "{":
        return "}" 
    if c == "[":
        return "]"
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