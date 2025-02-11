import numpy as np

def neighbours(matrix, x, y):
    [n, m] = matrix.shape  # Get matrix dimensions
    n4 = []  # Neighbors in 4 directions
    nd4 = []  # Neighbors in diagonal directions
    n8 = []  # All 8 neighbors

    # 4-directional neighbors
    for dx, dy in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < m:
            n4.append(int(matrix[nx, ny]))

    # Diagonal neighbors
    for dx, dy in [(1, 1), (-1, 1), (1, -1), (-1, -1)]:
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < m:
            nd4.append(int(matrix[nx, ny]))

    # Combine both
    n8 = n4 + nd4
    print("4-directional neighbors:", n4)
    print("Diagonal neighbors:", nd4)
    print("All 8 neighbors:", n8)

# Generate a random 10x10 matrix with values between 0 and 255
mat = np.random.randint(0, 255, (10, 10))
print("Matrix:\n", mat)

# Input coordinates
try:
    x = int(input("Enter x (row index, 0-9): "))
    y = int(input("Enter y (column index, 0-9): "))
    if 0 <= x < mat.shape[0] and 0 <= y < mat.shape[1]:
        neighbours(mat, x, y)
    else:
        print("Coordinates out of bounds. Please enter valid indices between 0 and 9.")
except ValueError:
    print("Invalid input. Please enter integers only.")
