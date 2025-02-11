import numpy as np
import matplotlib.pyplot as plt

# Define the function y(t) = 8cos(t^2)
def y(t):
    return 8 * np.cos(t**2)

# Define the sampling function dy(t)
def dy(t, fs):
    return y(t * fs)  # Sample y(t) at the given frequency fs

# Sampling parameters
fs = 5  # Sampling frequency in Hz
duration = 2  # Duration of sampling in seconds

# Generate time values
t_continuous = np.linspace(0, duration, 1000)  # Continuous time for plotting
t_discrete = np.arange(0, duration, 1/fs)  # Discrete time for sampling

# Sample the function y(t) at the given frequency
y_continuous = y(t_continuous)
y_discrete = dy(t_discrete, fs)

# Plot the continuous and discrete samples
plt.plot(t_continuous, y_continuous, label='y(t) = 8cos(t^2)')
plt.stem(t_discrete, y_discrete, 'r', markerfmt='ro', basefmt=" ", linefmt='r', label=f'Sampled at {fs} Hz')
plt.xlabel('Time (s)')
plt.ylabel('Amplitude')
plt.title('Sampling of y(t) at 5 Hz')
plt.legend()
plt.grid(True)
plt.show()
