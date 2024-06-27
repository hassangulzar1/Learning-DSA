class Solution:
    def numberOfSteps(self, num: int) -> int:
       

     def helper( n:int,steps:int)->int:
        if n == 0:
            return steps
        
        if n % 2 == 0:
            return helper(n // 2, steps + 1)
        return helper(n - 1, steps + 1) 

     return helper(num,0)