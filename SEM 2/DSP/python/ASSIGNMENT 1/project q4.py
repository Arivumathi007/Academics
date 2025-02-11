import numpy as np
import matplotlib.pyplot as plt

# Define time range and sampling rate
t = np.linspace(0, 10, 1000)  # Time range from 0 to 10 seconds with 1000 samples
f = 2  # Base frequency

# Define signals
signal1 = 3 * np.sin(2 * np.pi * f * t)
signal2 = 3 * np.sin(4 * np.pi * f * t)
signal3 = 3 * np.sin(8 * np.pi * f * t)
signal4 = 3 * np.sin(16 * np.pi * f * t)
combined_signal = signal1 + signal2 + signal3 + signal4

# Calculate periods
period1 = 2 * np.pi / (2 * np.pi * f)  # Period of sin(2t) is 1 second
period2 = 2 * np.pi / (4 * np.pi * f)  # Period of sin(4t) is 0.5 second
period3 = 2 * np.pi / (8 * np.pi * f)  # Period of sin(8t) is 0.25 second
period4 = 2 * np.pi / (16 * np.pi * f)  # Period of sin(16t) is 0.125 second
period_combined = 2 * np.pi / (np.lcm.reduce([2, 4, 8, 16]) * np.pi * f)  # Period of combined signal

# Plot signals
plt.figure(figsize=(10, 6))

plt.plot(t, signal1, label='3 sin(2t)')
plt.plot(t, signal2, label='3 sin(4t)')
plt.plot(t, signal3, label='3 sin(8t)')
plt.plot(t, signal4, label='3 sin(16t)')
plt.plot(t, combined_signal, label='3 sin(2t) + 3 sin(4t) + 3 sin(8t) + 3 sin(16t)')

plt.xlabel('Time (s)')
plt.ylabel('Amplitude')
plt.title('Four Signals and Their Sum')
plt.legend()

# Print periods
print("Period of sin(2t):", period1, "seconds")
print("Period of sin(4t):", period2, "seconds")
print("Period of sin(8t):", period3, "seconds")
print("Period of sin(16t):", period4, "seconds")
print("Period of combined signal:", period_combined, "seconds")

plt.grid(True)
plt.show()
