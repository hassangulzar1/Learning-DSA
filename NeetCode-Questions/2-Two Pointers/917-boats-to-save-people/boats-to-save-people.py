class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        s= 0
        e = len(people) - 1
        boats = 0

        while s <= e:
            if people[s] + people[e] <= limit:
                boats += 1
                s +=1
                e -=1
            elif people[s] + people[e] > limit and people[s] > people[e]:
                boats += 1
                s += 1
            else:
                boats += 1
                e -=1

        return boats



        
        