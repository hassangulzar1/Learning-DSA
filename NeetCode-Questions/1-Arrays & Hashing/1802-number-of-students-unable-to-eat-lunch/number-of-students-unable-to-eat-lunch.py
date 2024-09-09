class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        res  = len(students)

        count = Counter(students)
        for san in sandwiches:
            if count[san] > 0:
                count[san] -= 1
                res -= 1
            else:
                return res
        return res
        