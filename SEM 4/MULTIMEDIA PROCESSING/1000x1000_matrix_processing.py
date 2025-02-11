import random
import csv
matrix=[[0 for _ in range(100)] for _ in range(100)] #initialising a 2d list

for i in range(100):
    for j in range(100):
        matrix[i][j]=random.randint(0,100) #filling the matrix with random values using randint function from ramdom module
        
def rowsum(num):
    sum=0
    for j in range(100):
        sum+=matrix[num][j]
    print("Sum of the elements in the row ",num," is :",sum)
    
def columnsum(num):
    sum=0
    for i in range(100):
        sum+=matrix[i][num]
    print("Sum of the elements in the column ",num," is :",sum)
    
        
        
with open("matrix.csv","w") as f:
    cwriter=csv.writer(f)
    cwriter.writerows(matrix)
    print("Successful")
    
rowsum(1)
columnsum(1)
    
    