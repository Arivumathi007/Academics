import numpy as np

# Input size of the matrix
x = int(input("Enter a number: "))

# Generate a square matrix with random integers from 0 to 9
matrix = np.random.randint(0, 10, (x, x))

# Print the matrix
for i in range(x):
    for j in range(x):
        print(matrix[i][j], end="\t")
    print()

# Calculate the histogram of occurrences of each number (0 to 9)
histogram = np.bincount(matrix.flatten(), minlength=10)

# Print the histogram
for value, frequency in enumerate(histogram):
    print(value, frequency)
