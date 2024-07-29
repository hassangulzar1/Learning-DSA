class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        cow,bull = 0, 0
        secret_map,guess_map= {},{}

        for i , j in zip(secret,guess):
            if i == j:
                bull += 1
            else:
                secret_map[i] = 1 + secret_map.get(i,0)
                guess_map[j] = 1 + guess_map.get(j,0)

        for i in secret_map:
            if i in guess_map:
                cow += min(secret_map[i],guess_map[i])
        
        return f"{bull}A{cow}B"

    

        
        