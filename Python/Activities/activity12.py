def sum_numbers(n):
    if n == 0:
        return 0
    else:
        return n + sum_numbers(n - 1)
result = sum_numbers(15)
print("Sum from 0 to 15 is:", result)
