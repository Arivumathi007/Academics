def bitplane(x, y, z, a):
    # Initialize an empty list for the bitplane
    b = [[0 for _ in range(y)] for _ in range(x)]

    # Extract the specified bitplane
    for i in range(x):
        for j in range(y):
            b[i][j] = (a[i][j] >> z) & 1

    # Print the bitplane
    for i in range(x):
        for j in range(y):
            print(b[i][j], end=" ")
        print()

def main():
    # Get input for dimensions and bitplane index
    print("Enter image dimensions (rows and columns) and bitplane index (0-7):")
    x, y, z = map(int, input().split())

    if z < 0 or z > 7:
        print("Invalid bitplane index. Please enter a value between 0 and 7.")
        return

    # Initialize the image matrix
    a = []
    print("Enter intensity values for the image:")
    for i in range(x):
        row = list(map(int, input().split()))
        a.append(row)

    print(f"Bitplane {z} of the image:")
    bitplane(x, y, z, a)

if __name__ == "__main__":
    main()
