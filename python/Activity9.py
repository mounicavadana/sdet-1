
listOne = [6,9,34,78,91]
listTwo = [13,56,86,23]

print("First List ", listOne)
print("Second List ", listTwo)

thirdList = []

for num in listOne:
    if (num % 2 != 0) :
       thirdList.append(num)

for num in listTwo:
    if (num % 2 == 0) :
       thirdList.append(num)       

# Print result
print("result List is:", thirdList)
