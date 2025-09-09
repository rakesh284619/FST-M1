user_input = input("Enter numbers separated by spaces: ")
numbers = tuple(map(int, user_input.split()))
for num in numbers:
    if num % 5 == 0:
        print(num)
