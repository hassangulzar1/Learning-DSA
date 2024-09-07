class Solution:
    def isPathCrossing(self, path: str) -> bool:
        visit = set()

        curr = (0,0)
        visit.add(curr)


        for dst in path:
            x, y = curr
            if dst == "N":
               y += 1
            elif dst == "E":
                x += 1
            elif dst == "S":
                y -= 1
            else:
                x -= 1
            curr = (x, y)

            if curr in visit:
                return True

            visit.add(curr)
        return False


        