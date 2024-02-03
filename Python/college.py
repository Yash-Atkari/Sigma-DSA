# name=[]
# age=[]
# tell=int(input("Enter 1 to continue or 0 to stop:"))
# while tell==1:
#     detail=input("Enter detail:")
#     if detail.isdigit():
#         age.append(detail)
#         print(age)
#     else:
#         name.append(detail)
#         print(name)
#     tell=int(input("Enter 1 to continue or 0 to stop:"))
# print("Have a nice day")


# #2 Program to print Fibonacci series using while loop
# nterms = int(input("How many terms :"))
# n1 = 0
# n2 = 1
# count = 0
# while count < nterms:
#     print(n1)
#     n3=n1+n2
# #Update values of n1 and n2    
#     n1 = n2
#     n2 = n3  
#     count = count+1  


# #3 Rock, Paper, Scissor Game
# import random
# user1 = input("Give your choice: ").lower()
# computer = random.choice(["rock", "paper", "scissor"])
# if computer == user1:
#     print("It's a tie!")
# elif (computer == "rock" and user1 == "paper") or (computer == "paper" and user1 == "scissor") or (computer == "scissor" and user1 == "rock"):
#     print(f"{user1} wins!")
# else:
#     print(f"{computer} wins!")


# #4 Age Calculator
# bd = int(input("Enter birth date:"))
# bm = int(input("Enter birth month:"))
# by = int(input("Enter birth year:"))
# cd = int(input("Enter current date:"))
# cm = int(input("Enter current month:"))
# cy = int(input("Enter current year:"))

# if cd > bd:
#     rd = cd - bd
# else:
#     rd = (cd + 30) - bd
#     cm = cm - 1

# if cm > bm:
#     rm = cm - bm
# else:
#     rm = (cm + 12) - bm
#     by = by - 1

# ry = cy - by
# print("Your Age is", ry, "Years", rm, "Months", rd, "Days")


# #5 Guess the number
# import random
# computer = random.choice(range(1, 10))  
# for i in range(0, 3):
#     user = int(input("Enter number between 1-10: "))
#     if user > computer:  
#         print("Your choice is greater than me. Decrease the Input")
#     elif user < computer: 
#         print("Your choice is lesser than me. Increase The Input")
#     elif user == computer: 
#         print("You guessed the right number.")
#         break
#     continue
# else:
#     print("You Loose")


# #6 Prime number
# num = int(input("Enter number:"))
# flag = False
# if num > 1:
#     for i in range(2,num):
#         if num % i == 0:
#             flag = True
#             break
# if flag:
#     print("Non-prime number")
# else:
#     print("Prime number")


# #7 Check even or odd
# num = int(input("Enter number:"))
# if num % 2 ==0:                                                                                                                                
#     print("Even number")
# else:
#     print("Odd number")

# #8 Celsius into Fahrenheit
# celsius = int(input("Enter temperature in celsius:"))
# fahrenheit = (celsius * 1.8) + 32
# print(f"Temperature in Fahrenheit is {fahrenheit} ")


# #9
# X = [[12,7,3], 
#      [4 ,5,6], 
#      [7 ,8,9]] 

# Y = [[5,8,1], 
#      [6,7,3], 
#      [4,5,9]] 

# result = [[0,0,0], 
#           [0,0,0], 
#           [0,0,0]] 

# for i in range(len(X)): 
#     for j in range(len(X[0])): 
#         result[i][j] = X[i][j] + Y[i][j] 

# for r in result: 
#     print(r)


# #Dictionary Example
# #Creating a Dictionary
# student_marks = {"John" : 82, "Jain" : 89, "Bob" : 92}

# #Accesing values using keys
# print(student_marks["Jain"])

# #Accesing values using for loop
# for name, mark in student_marks.items():
#     print(f"Marks of {name} is {mark}")

# #Adding new key-value pair
# student_marks["Yash"] = 99
# print(student_marks)

# #Updating values of keys
# student_marks["Yash"] = 100
# print(student_marks)

# #Removing new key-value pair
# del student_marks["Yash"]
# print(student_marks)

# #Checking key exist or not
# print("Bob" in student_marks)
# print("Yash" in student_marks)


# #Exception Handling
# try:
#     num1 = 10
#     num2 = a
#     result = num1/num2
#     print(result)
# except ZeroDivisionError:
#     print("Division by zero is not possible")
# except NameError:
#     print("Some variables are not defined")
# else:
#     print("No Exception Occurs")
# finally:
#     print("Program finished")

#Exam Score Booster Programs

#1 Sum of two number
# num1=int(input("Enter number1:"))
# num2=int(input("Enter number2:"))
# sum=num1+num2
# print(f"The sum of num1 and num2 is {sum}")

#2 Simple interest
# p=int(input("Enter principle amount:"))
# r=int(input("Enter rate of interest:"))
# t=int(input("Enter time period:"))
# si=(p*r*t)/100
# print(f"The simple interest is {si}")

#3 Even or odd number
# num=int(input("Enter number:"))
# if num%2==0 :
#     print("Even number")
# else :
#     print("Odd number")

#4 Greatest between 3 numbers
# a=int(input("Enter number1:"))
# b=int(input("Enter number2:"))
# c=int(input("Enter number3:"))
# max_ab=max(a,b)
# max_abc=max(max_ab,c)
# print(f"The greatest number is {max_abc}")

#5 Greatest between 3 numbers
# a=int(input("Enter number1:"))
# b=int(input("Enter number2:"))
# c=int(input("Enter number3:"))
# if a>b :
#     if a>c :
#         print(f"{a} is greatest")
#     else :
#         print(f"{c} is greatest")
# elif b>c :
#     print(f"{b} is greatest")
# else :
#     print(f"{c} is greatest")

#6 Area of circle
# r=int(input("Enter radius:"))
# circle_area=3.14*(r**2)
# print(f"The area of circle is {circle_area}")


#7 squared list
# def squared_list(numbers):
#     squared_list=[number**2 for number in numbers]
#     return squared_list
# numbers=[1,2,3,4,5]
# result=squared_list(numbers)
# print(result)

#8 List operations 

# #Creating a list

# my_list=[10,20,30,40,50]
# print(my_list)

# #Add operation

# my_list.append(60)
# print(my_list)

# #Update operation

# my_list[2]=35
# print(my_list)

# #Insert operation

# my_list.insert(3,36)
# print(my_list)

# #Remove operation

# my_list.remove(36)
# print(my_list)

# #Delete operation

# del my_list[4]
# print(my_list)

# #Pop operation

# my_list.pop(0)
# print(my_list)

# #Clear list

# my_list.clear()
# print(my_list)

#9 Slicing of string
# text="Hello,World!"

# substring1=text[0:5]
# print(substring1)

# substring2=text[:5]
# print(substring2)

# substring3=text[6:]
# print(substring3)

# substring4=text[-6:]
# print(substring4)

# substring5=text[::2]
# print(substring5)

# substring6=text[::-1]
# print(substring6)











