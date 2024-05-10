s = "A man, a plan, a canal: Panama"
def isNumeric(char):
   if "a" <= char <= "z" and "A" <= char <= "Z" and "0" <= char <= "9":
      return True
   else:
      return False

i = 0
j = len(s) - 1
while i < j:
  while not isNumeric(s[i]) and i < j:
     i += 1
  while not isNumeric(s[j]) and i < j:
     i -= 1

  if s[i].lower() == s[j].lower():
     i += 1
     j -= 1
  else:
     print(False)


