fruits = {
    "apple": 120,
    "banana": 40,
    "mango": 150,
    "orange": 80,
    "grapes": 90
}
fruit_name = input("Enter fruit name: ").lower()
price = fruits.get(fruit_name)

if price:
    print(f"{fruit_name.capitalize()} is available at ₹{price} per kg.")
else:
    print(f"Sorry, {fruit_name.capitalize()} is not available.")
