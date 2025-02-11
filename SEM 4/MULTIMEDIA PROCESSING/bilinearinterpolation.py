import numpy as np
x1=int(input("Enter the no.of rows of old matrix:"))
y1=int(input("Enter the no.of cols of old matrix:"))
x=np.zeros((x1,y1),dtype=float)
for i in range(x1):
    for j in range(y1):
        x[i][j]=int(input())


x2=int(input("Enter the no.of rows of new matrix:"))
y2=int(input("Enter the no.of cols of new matrix:"))
y=np.zeros((x2,y2),dtype=float)
y[0][0]=x[0][0]
y[x2-1][0]=x[x1-1][0]
y[0][y2-1]=x[0][y1-1]
y[x2-1][y2-1]=x[x1-1][y1-1]
depth=int(input("Enter the deapth:"))
for i in range(x2):
    if i!=0 and i!=x2-1:
        y[i][0]=(y[0][0]*(x2-i-1))/depth + (y[x2-1][0]*i)/depth
        y[i][y2-1]=(y[0][y2-1]*(x2-i-1))/depth + (y[x2-1][y2-1]*i)/depth
    for j in range(y2):
        if j!=0 and j!=y2-1:
            y[i][j]=(y[i][0]*(y2-1-j))/depth + (y[i][y2-1]*j)/depth

print(y)

            
        
            
