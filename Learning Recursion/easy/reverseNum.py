def rev(n):
    if not n % 10:
        return n
    
    return (n % 10 * 10) + rev(n // 10)


print(rev(123))