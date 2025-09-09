def sum_list(numbers):
    total = 0
    for num in numbers:
        total += num
    print("Sum of elements:", total)
nums = list(map(int, input("Enter numbers separated by spaces: ").split()))
sum_list(nums)
