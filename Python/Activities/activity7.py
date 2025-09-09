user_input = input("Enter numbers separated by spaces: ")

numbers = list(map(int, user_input.split()))
total = 0
for num in numbers:
    total += num
print("The sum of the numbers is:", total)
