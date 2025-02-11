import numpy as np
import matplotlib.pyplot as plt

# Define the functions
def y(t):
    return 8 * np.cos(t**2)

def dy_dt(t):
    return -16 * t * np.sin(t**2)

# Generate values for t
t_values = np.linspace(-10, 10, 1000)

# Calculate y(t) and dy/dt for each t value
y_values = y(t_values)
dy_dt_values = dy_dt(t_values)

# Plot y(t) and dy/dt
plt.figure(figsize=(10, 6))
plt.plot(t_values, y_values, label='$y(t) = 8 \cdot \cos(t^2)$')
plt.plot(t_values, dy_dt_values, label='$\\frac{dy(t)}{dt} = -16t \cdot \sin(t^2)$')
plt.title('Plot of $y(t)$ and $\\frac{dy(t)}{dt}$')
plt.xlabel('$t$')
plt.ylabel('Function Value')
plt.legend()
plt.grid(True)
plt.show()
