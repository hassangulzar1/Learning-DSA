def subSeq(p,up):
    if up == "":
      return [p]
    
    digit = int(up[0])
    ans = []
    for i in range((digit - 1) * 3, digit * 3):
       ch = chr(ord('a') + i)
       ans.extend(subSeq(p + ch, up[1:]))
    
    return ans
       

print(subSeq("","12"))