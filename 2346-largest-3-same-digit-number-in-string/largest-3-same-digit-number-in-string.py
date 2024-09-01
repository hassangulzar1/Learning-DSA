class Solution:
    def largestGoodInteger(self, num: str) -> str:
        itr = ["999","888","777","666","555","444","333","222","111","000"]

        for n in itr:
            for s in range(len(num)):
                sl = num[s:s+3]
                if sl == n:
                    return n

        return ""


        