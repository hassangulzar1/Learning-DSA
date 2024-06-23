def rev(n):
    if n == 0:
        return
    print(n)
    rev(n - 1)
    print(n)

rev(5)