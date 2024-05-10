prices = [7,1,5,3,6,4]

profit = 0
buy = prices[0]
for cell in prices[1:]:
    if cell < buy:
        buy = cell
    else:
        profit = max(profit, cell - buy)

print(profit)