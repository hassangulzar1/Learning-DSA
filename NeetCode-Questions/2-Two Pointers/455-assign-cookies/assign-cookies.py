class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        fir,sec = 0, 0

        while fir < len(g) and sec < len(s):
            if s[sec] >= g[fir]:
                fir += 1
                sec += 1
            else:
                sec += 1
        return fir
        