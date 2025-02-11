import numpy as np
import matplotlib.pyplot as plt
import sympy as sp
# Define the function y(t)
def y(t):
    return np.sin(3 * t) / (3 * t)

# Generate values for t
t_values = np.linspace(-15, 15, 1000)

# Calculate y(t) values
y_values = y(t_values)

# Plot y(t)
plt.plot(t_values, y_values, label='y(t) = sin(3t)/(3t)')
plt.xlabel('t')
plt.ylabel('y(t)')
plt.title('Plot of y(t)')
plt.grid(True)
plt.legend()
plt.show()

# Define the variable and the function
t = sp.symbols('t')
f_t = sp.sin(3*t) / (3*t)

# Compute the limit
limit_at_0 = sp.limit(f_t, t, 0)
print("Value of y(t) at t = 0 using limits:", limit_at_0)
