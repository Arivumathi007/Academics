import numpy as np

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

# Quantization function
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

# Compute RMSE for 3-bit quantization
rmse_3bit = np.sqrt(np.mean((dy_dt_samples - dy_dt_3bit)**2))

# Compute RMSE for 5-bit quantization
rmse_5bit = np.sqrt(np.mean((dy_dt_samples - dy_dt_5bit)**2))

# Print the RMSE values
print(f"RMSE for 3-bit quantization: {rmse_3bit}")
print(f"RMSE for 5-bit quantization: {rmse_5bit}")
