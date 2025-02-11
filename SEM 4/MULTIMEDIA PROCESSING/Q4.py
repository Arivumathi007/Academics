import numpy as np

def linear_interpolation(x, x_points, y_points):

    # Ensure x_points and y_points are numpy arrays
    x_points = np.array(x_points)
    y_points = np.array(y_points)

    # Use numpy's interp function to perform linear interpolation
    return np.interp(x, x_points, y_points)

# Get user input for x_points, y_points, and x
x_points = list(map(float, input("Enter the x-values (comma separated): ").split(',')))
y_points = list(map(float, input("Enter the corresponding y-values (comma separated): ").split(',')))
x = float(input("Enter the x-value for interpolation: "))

# Perform interpolation
y = linear_interpolation(x, x_points, y_points)
print(f"The interpolated value at x = {x} is y = {y}")
