import math

piles = [3,6,7,11]
h = 8

s,e = 1 , max(piles)

res = e

while s <= e:
    hours = 0
    mid = (s+e)//2

    for p in piles:
        hours += math.ciel(p/mid)
    if hours <= h:
        res = min(res,mid)
        e = mid - 1
    else:
        s = mid + 1
