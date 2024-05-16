s = "aa"
t = "aa"

# if t == "":
#     return ""

tCount,window = {},{}
for i in t:
    tCount[i] = 1 + tCount.get(i,0)
   
have,need = 0 , len(tCount)

res,resLen = [-1,-1],float("infinity")

l = 0 
for r in range(len(s)):
   c = s[r]
   window[c] = 1 + window.get(r,0)
   if c in tCount and window[c] == tCount[c]:
       have += 1
   while have == need:
       if (r - l + 1) < resLen:
           res = [l , r]
           resLen = r - l + 1
       window[s[l]] -= 1
       if s[l] in tCount and window[s[l]] < tCount[s[l]]:
           have -= 1
       l += 1

l, r
print(res)