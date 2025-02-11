import csv
import random
import matplotlib.pyplot as plt
from collections import Counter

# Create a 1000x1000 matrix with random pixel intensities between 0 and 255
arr = [[random.randint(0, 255) for _ in range(1000)] for _ in range(1000)]

# Flatten the 2D array to a 1D list
flattened_arr = [pixel for row in arr for pixel in row]

# Count frequencies of pixel intensities using Counter
pixel_counts = Counter(flattened_arr)

# Prepare data for histogram
intensities = list(range(256))  # Pixel intensities range from 0 to 255
frequencies = [pixel_counts.get(i, 0) for i in intensities]

# Print total pixels and frequency distribution
total_pixels = len(flattened_arr)
print(f"Total Pixels: {total_pixels}")
print(f"Pixel Frequencies: {frequencies}")

# Histogram visualization
plt.bar(intensities, frequencies, color='red', alpha=0.7)
plt.title("Histogram of Pixel Intensities")
plt.xlabel("Pixel Intensity")
plt.ylabel("Frequency")
plt.grid(axis='y', linestyle='--', alpha=0.7)
plt.show()
