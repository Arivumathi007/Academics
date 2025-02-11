import numpy as np
import pandas as pd

# Step 1: Create a 100x100 matrix with random integers between 1 and 100
matrix = np.random.randint(1, 101, size=(100, 100))

# Step 2: Add row sums and column sums
row_sums = matrix.sum(axis=1)
col_sums = matrix.sum(axis=0)

# Create a DataFrame to store the matrix along with the sums
df = pd.DataFrame(matrix)
df['Row_Sum'] = row_sums

# Add column sums as a new row at the bottom
col_sums_row = np.append(col_sums, [0])  # Append 0 for the Row_Sum column
df.loc['Col_Sum'] = col_sums_row

# Step 3: Save the result to a CSV file
output_file_path = "C:/Users/arivu/Desktop/matrix_with_sums.csv"
df.to_csv(output_file_path, index=False)

output_file_path
