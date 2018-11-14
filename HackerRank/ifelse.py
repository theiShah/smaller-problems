#!/bin/python3

# Task 
# Given an integer, , perform the following conditional actions:

# If  is odd, print Weird
# If  is even and in the inclusive range of  to , print Not Weird
# If  is even and in the inclusive range of  to , print Weird
# If  is even and greater than , print Not Weird
# Input Format
#   A single line containing a positive integer, .

# Constraints

# Output Format
#   Print Weird if the number is weird; otherwise, print Not Weird.

N = int(input())

if N%2 == 1:
    print("Weird")
elif 2 <= N and 5 >= N :
    print("Not Weird")
elif 6 <= N and 20 >= N :
    print("Weird")
else :
    print("Not Weird")