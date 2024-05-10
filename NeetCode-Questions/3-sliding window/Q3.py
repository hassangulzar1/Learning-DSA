s = "pwwkew"


longest = 0
left = 0
charSet = set()
for n in range(len(s)):
    while s[n] in charSet:
        charSet.remove(s[left])
        left += 1
    charSet.add(s[n])
    longest = max(longest, n - left + 1)
print(longest)