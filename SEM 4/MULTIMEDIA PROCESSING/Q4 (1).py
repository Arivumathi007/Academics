import random

def random_matrix(rows, cols):
    return [[random.randint(0, 9) for _ in range(cols)] for _ in range(rows)]

def scale_linear(matrix, factor):
    rows = len(matrix)
    cols = len(matrix[0])
    new_rows = rows * factor
    new_cols = cols * factor
    scaled = [[0] * new_cols for _ in range(new_rows)]
    
    for i in range(new_rows):
        for j in range(new_cols):
            x = i / factor
            y = j / factor
            x0 = int(x)
            y0 = int(y)
            x1 = min(x0 + 1, rows - 1)
            y1 = min(y0 + 1, cols - 1)
            dx = x - x0
            dy = y - y0
            scaled[i][j] = round(matrix[x0][y0] * (1 - dx) + matrix[x1][y0] * dx)
    
    return scaled

def display(matrix):
    for row in matrix:
        print(" ".join(map(str, row)))

matrix = random_matrix(2, 2)
factor = int(input("Enter scale factor: "))
print("Original Matrix:")
display(matrix)
print("Scaled Matrix:")
scaled = scale_linear(matrix, factor)
display(scaled)