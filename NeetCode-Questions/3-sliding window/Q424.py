s = "ABAB"
k = 2 

l = 0
longest = 0
maxF = 0
count = {}
for r in range(len(s)):
    count[s[r]] = 1 + count.get(s[r],0)

    while (r - l + 1) - max(count.values()) > k:
        l += 1
    longest = max(longest, r - l + 1)
print(longest)
    