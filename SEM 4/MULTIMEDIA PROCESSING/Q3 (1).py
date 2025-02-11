import random

def matrix(rows, cols):
    return [[random.randint(0, 9) for _ in range(cols)] for _ in range(rows)]

def n4(mat, i, j):
    res = []
    r = len(mat)
    c = len(mat[0])
    if i > 0:
        res.append(mat[i-1][j])
    if i < r - 1:
        res.append(mat[i+1][j])
    if j > 0:
        res.append(mat[i][j-1])
    if j < c - 1:
        res.append(mat[i][j+1])
    return res

def nd4(mat, i, j):
    res = []
    r = len(mat)
    c = len(mat[0])
    if i > 0 and j > 0:
        res.append(mat[i-1][j-1])
    if i > 0 and j < c - 1:
        res.append(mat[i-1][j+1])
    if i < r - 1 and j > 0:
        res.append(mat[i+1][j-1])
    if i < r - 1 and j < c - 1:
        res.append(mat[i+1][j+1])
    return res

def n8(mat, i, j):
    return n4(mat, i, j) + nd4(mat, i, j)

mat = matrix(1000, 1000)
i, j = map(int, input("Enter row and column index: ").split())
print("N4 Neighbors:", n4(mat, i, j))
print("ND4 Neighbors:", nd4(mat, i, j))
print("N8 Neighbors:", n8(mat, i, j))