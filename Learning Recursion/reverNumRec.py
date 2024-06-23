def rev(n):
    if n == 0:
        return
    print(n)
    return rev(n - 1)

rev(5)