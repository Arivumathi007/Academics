import random

def random_matrix(rows, cols):
    return [[random.randint(0, 9) for _ in range(cols)] for _ in range(rows)]

def scale_matrix(matrix, factor):
    original_rows = len(matrix)
    original_cols = len(matrix[0])
    scaled_rows = original_rows * factor
    scaled_cols = original_cols * factor
    scaled = [[0] * scaled_cols for _ in range(scaled_rows)]
    
    for i in range(scaled_rows):
        for j in range(scaled_cols):
            scaled[i][j] = matrix[i // factor][j // factor]
    
    return scaled

def display(matrix):
    for row in matrix:
        print(" ".join(map(str, row)))

matrix = random_matrix(2, 2)
factor = int(input("Enter scale factor: "))
print("Original Matrix:")
display(matrix)
print("Scaled Matrix:")
scaled_matrix = scale_matrix(matrix, factor)
display(scaled_matrix)