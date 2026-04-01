# Raw sales data: [Item Name, Quantity, Price Per Unit]
raw_sales = [
    ["Apple", 10, 1.5],
    ["Banana", "5", 0.5],      # Error: Quantity is a string
    ["Orange", 0, 1.2],        # Error: Zero quantity
    ["Grapes", 3, "2.0"],      # Error: Price is a string
    ["Pineapple", None, 5.0],  # Error: Missing quantity
    ["Watermelon", 1, -10.0]   # Error: Negative price
]

cleaned_data = []
grand_total = 0
for item in raw_sales:
    name = item[0]
    
    try:
        qty = int(item[1])
        price = float(item[2])

        if qty > 0 and price > 0:
            total = qty * price

            cleaned_data.append([name, total])
            grand_total += total
        else:
            print(f"Skipping {name}: Invalid values (Qty: {qty}, Price: {price})")

    except:
        print(f"Skipping {name}: Data type error!")

print("\n--- Cleaned Sales Report ---")
for name, total in cleaned_data:
    print(f"Item: {name} | Revenue: Rs. {total:.2f}")

print("-" * 30)

print(f"Final Total Revenue: Rs. {grand_total:.2f}")

