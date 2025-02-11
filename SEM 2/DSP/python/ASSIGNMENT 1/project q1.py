import cmath

# Define the complex number Z
Z = cmath.exp(1j * (5 + 10j)) * (cmath.cos(0.25 * cmath.pi) + 1j * cmath.sin(cmath.pi / 3))

# Compute the magnitude (|Z|)
magnitude_Z = abs(Z)

# Compute the phase angle (theta)
theta = cmath.phase(Z)

# Print the results
print("|Z| =", magnitude_Z)
print("theta =", theta, "radians")
print("theta =", theta * 180 / cmath.pi, "degrees")
