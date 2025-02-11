import numpy as np
import matplotlib.pyplot as plt

# Assume the recorded voice signal is stored in a numpy array named 'recorded_signal'
# You can replace this with your actual recorded signal

# Define the recorded signal (just a placeholder)
recorded_signal = np.sin(2 * np.pi * 440 * np.linspace(0, 1, 44100))

# a. Plot the recorded output
plt.figure(figsize=(10, 4))
plt.plot(recorded_signal)
plt.title("Recorded Output")
plt.xlabel("Sample")
plt.ylabel("Amplitude")
plt.show()

# b. Check the sampling rate
sampling_rate = 44100  # Assuming a sampling rate of 44100 Hz
print("Sampling rate:", sampling_rate, "Hz")

# c. Reconstruct the signal with 50% of the sampling rate and 4-bit quantization
new_sampling_rate = int(sampling_rate / 2)  # 50% of the original sampling rate

# Perform downsampling
downsampled_signal = recorded_signal[::2]

# Perform quantization (4-bit)
quantized_signal = np.round(downsampled_signal * (2**4 - 1)) / (2**4 - 1)

# Plot the reconstructed signal
plt.figure(figsize=(10, 4))
plt.plot(quantized_signal)
plt.title("Reconstructed Signal (50% Sampling Rate, 4-bit Quantization)")
plt.xlabel("Sample")
plt.ylabel("Amplitude")
plt.show()
