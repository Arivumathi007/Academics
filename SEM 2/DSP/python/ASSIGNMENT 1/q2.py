Python
import matplotlib.pyplot as plt

# Get the magnitudes and angles of the black and blue vectors from the user
black_magnitude = float(input("Enter the magnitude of the black vector: "))
black_angle = float(input("Enter the angle of the black vector: "))
blue_magnitude = float(input("Enter the magnitude of the blue vector: "))
blue_angle = float(input("Enter the angle of the blue vector: "))

# Convert angles to radians
black_angle = black_angle * math.pi / 180
blue_angle = blue_angle * math.pi / 180

# Resolve the black and blue vectors into their x and y components
black_x = black_magnitude * math.cos(black_angle)
black_y = black_magnitude * math.sin(black_angle)
blue_x = blue_magnitude * math.cos(blue_angle)
blue_y = blue_magnitude * math.sin(blue_angle)

# Sum the x and y components of the black and blue vectors to get the red vector components
red_x = black_x + blue_x
red_y = black_y + blue_y

# Calculate the magnitude and angle of the red vector
red_magnitude = math.sqrt(red_x**2 + red_y**2)
red_angle = math.atan2(red_y, red_x) * 180 / math.pi

# Print the magnitude and angle of the red vector
print("The magnitude of the red vector is:", red_magnitude)
print("The angle of the red vector is:", red_angle)

# Create a plot to show the vectors
plt.figure()
plt.axhline(0, color='black', linestyle='--')
plt.axvline(0, color='black', linestyle='--')

# Plot the black vector
plt.plot([0, black_x], [0, black_y], label='Black', color='black')
plt.annotate('Black', (black_x, black_y), xytext=(10, 0), textcoords='offset points')

# Plot the blue vector
plt.plot([0, blue_x], [0, blue_y], label='Blue', color='blue')
plt.annotate('Blue', (blue_x, blue_y), xytext=(10, 0), textcoords='offset points')

# Plot the red vector
plt.plot([0, red_x], [0, red_y], label='Red', color='red')
plt.annotate('Red', (red_x, red_y), xytext=(10, 0), textcoords='offset points')

# Set labels and title
plt.xlabel('X')
plt.ylabel('Y')
plt.title('Black, Blue, and Red Vectors')

# Show the plot
plt.legend()
plt.grid(True)
plt.show()
