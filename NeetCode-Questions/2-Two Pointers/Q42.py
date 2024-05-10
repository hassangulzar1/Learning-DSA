height = [0,1,0,2,1,0,1,3,2,1,2,1]

# if not height: return 0

s = 0
e = len(height) -1

lMax = height[s]
rMax = height[e]
sum = 0
while s < e:
  if lMax < rMax:
    s += 1
    lMax = max(lMax,height[s])
    sum += lMax - height[s] 
  else:
    e -= 1
    rMax = max(rMax,height[e])
    sum += rMax - height[e] 

print(sum)