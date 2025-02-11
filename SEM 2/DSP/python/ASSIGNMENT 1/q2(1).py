import numpy as np
import matplotlib.pyplot as plt

# Gather vector information
magnitude_black = ...  # Replace with the actual magnitude
angle_black_degrees = ...  # Replace with the actual angle in degrees
magnitude_blue = ...  # Replace with the actual magnitude
angle_blue_degrees = ...  # Replace with the actual angle in degrees

# Convert angles to radians
angle_black_radians = np.radians(angle_black_degrees)
angle_blue_radians = np.radians(angle_blue_degrees)

# Compute components of black and blue vectors
black_x = magnitude_black * np.cos(angle_black_radians)
black_y = magnitude_black * np.sin(angle_black_radians)
blue_x = magnitude_blue * np.cos(angle_blue_radians)
blue_y = magnitude_blue * np.sin(angle_blue_radians)

# Compute components of red vector (resultant)
red_x = black_x + blue_x
red_y = black_y + blue_y

# Create plot
plt.figure(figsize=(8, 6))  # Adjust figure size as needed

# Plot vectors
plt.quiver(0, 0, black_x, black_y, color='black', label='Black', angles='xy', scale_units='xy', scale=1)
plt.quiver(0, 0, blue_x, blue_y, color='blue', label='Blue', angles='xy', scale_units='xy', scale=1)
plt.quiver(0, 0, red_x, red_y, color='red', label='Red (Resultant)', angles='xy', scale_units='xy', scale=1)

# Set axes limits
plt.xlim([-max(magnitude_black, magnitude_blue) + 0.5, max(magnitude_black, magnitude_blue) + 0.5])
plt.ylim([-max(magnitude_black, magnitude_blue) + 0.5, max(magnitude_black, magnitude_blue) + 0.5])

# Set axes labels
plt.xlabel('...')  # Replace with desired x-axis label
plt.ylabel('...')  # Replace with desired y-axis label

# Add title
plt.title('Vector Addition')  # Replace with desired title

# Add legend
plt.legend()

# Show plot
plt.show()
