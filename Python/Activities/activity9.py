list1 = list(map(int, input("Enter numbers for first list: ").split()))
list2 = list(map(int, input("Enter numbers for second list: ").split()))
new_list = []
for num in list1:
    if num % 2 != 0:
        new_list.append(num)
for num in list2:
    if num % 2 == 0:
        new_list.append(num)
print("New list:", new_list)
