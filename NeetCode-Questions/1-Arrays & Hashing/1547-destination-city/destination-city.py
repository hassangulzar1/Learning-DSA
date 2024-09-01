class Solution:
    def destCity(self, paths: List[List[str]]) -> str:

        hashset = {}

        for src,dst in paths:
            hashset[src] = dst
        
        for src, dst in paths:
            if dst not in hashset:
                return dst
        return ""

        