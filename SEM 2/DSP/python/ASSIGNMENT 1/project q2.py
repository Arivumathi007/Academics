import matplotlib.pyplot as plt
import numpy as np

# Define the magnitudes and angles of the black and blue vectors
black_magnitude = 3
black_angle_degrees = 30
blue_magnitude = 2
blue_angle_degrees = -45

# Convert angles from degrees to radians
black_angle_radians = np.radians(black_angle_degrees)
blue_angle_radians = np.radians(blue_angle_degrees)

# Compute the components of the black and blue vectors
black_x = black_magnitude * np.cos(black_angle_radians)
black_y = black_magnitude * np.sin(black_angle_radians)
blue_x = blue_magnitude * np.cos(blue_angle_radians)
blue_y = blue_magnitude * np.sin(blue_angle_radians)

# Compute the components of the resultant (red) vector
red_x = black_x + blue_x
red_y = black_y + blue_y

# Plot the vectors
plt.figure(figsize=(8, 6))
plt.quiver(0, 0, black_x, black_y, angles='xy', scale_units='xy', scale=1, color='black', label='Black Vector')
plt.quiver(black_x, black_y, blue_x, blue_y, angles='xy', scale_units='xy', scale=1, color='blue', label='Blue Vector')
plt.quiver(0, 0, red_x, red_y, angles='xy', scale_units='xy', scale=1, color='red', label='Red Vector (Resultant)')

# Set limits and labels
plt.xlim(-4, 4)
plt.ylim(-4, 4)
plt.xlabel('Real Axis')
plt.ylabel('Imaginary Axis')
plt.title('Vectors in the Complex Plane')
plt.legend()

# Display the plot
plt.grid()
plt.axhline(0, color='black',linewidth=0.5)
plt.axvline(0, color='black',linewidth=0.5)
plt.gca().set_aspect('equal', adjustable='box')
plt.show()
