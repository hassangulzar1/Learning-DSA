class Solution:
    def minimumChairs(self, s: str) -> int:
        chair = 0
        person = 0

        for i in s:
            if i == "E":
                person += 1
                if chair < person:
                    chair += 1
            else:
                person -=1
        return chair



        