from array import array
import csv
import pymysql



array = ["_"] * 10

print(*array, sep=" ")

array[4] = "A"

print(*array, sep=" ")