class Solution:
    def checkPerfectNumber(self, num: int) -> bool:

        if num <= 1:
            return False
        
        sum_divesor = 1
        sqrt_num = int(num ** 0.5)

        for i in range(2,sqrt_num + 1):
            if num % i == 0:
                sum_divesor += i
                if i != num // i:
                    sum_divesor += num //  i
               
        return sum_divesor == num


        