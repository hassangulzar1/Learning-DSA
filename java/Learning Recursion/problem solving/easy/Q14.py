x , y =5, 2

def product(x1,y1):
    if x1 < y1:
        return product(y1,x1)
    
    elif y1 != 0:
        return x1 + product(x1,y1 - 1)
    else:
        return 0
    
print(product(x,y))