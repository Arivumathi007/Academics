import numpy as np
import matplotlib.pyplot as plt

# Define the function y(t) = 8cos(t^2)
def y(t):
    return 8 * np.cos(t**2)

# Define the derivative function dy/dt
def dy_dt(t):
    return -16 * t * np.sin(t**2)

# Sampling parameters
fs = 10  # Sampling frequency in Hz
duration = 2  # Duration of sampling in seconds

# Generate time values
t = np.linspace(0, duration, int(fs * duration))

# Calculate the derivative of y(t)
dy_dt_samples = dy_dt(t)

# Quantization
def quantize(samples, bits):
    max_val = np.max(samples)
    min_val = np.min(samples)
    quant_levels = 2 ** bits
    step_size = (max_val - min_val) / quant_levels
    quantized_samples = np.round(samples / step_size) * step_size
    return quantized_samples

# Quantize the samples at 3-bit depth
dy_dt_3bit = quantize(dy_dt_samples, 3)

# Quantize the samples at 5-bit depth
dy_dt_5bit = quantize(dy_dt_samples, 5)

# Plot the original derivative and quantized versions
plt.plot(t, dy_dt_samples, label='Original dy/dt')
plt.scatter(t, dy_dt_3bit, color='red', marker='o', label='3-bit Quantized')
plt.scatter(t, dy_dt_5bit, color='green', marker='x', label='5-bit Quantized')
plt.xlabel('Time (s)')
plt.ylabel('Amplitude')
plt.title('Sampling and Quantization of dy/dt at 10 Hz')
plt.legend()
plt.grid(True)
plt.show()
