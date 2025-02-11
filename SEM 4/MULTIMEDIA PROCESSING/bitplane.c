#include <stdio.h>

void bitplane(int x, int y, int z, int a[x][y]) {
    int b[x][y];

    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            b[i][j] = (a[i][j] >> z) & 1;
        }
    }

    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            printf("%d ", b[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int x, y, z;

    printf("Enter image dimensions (rows and columns) and bitplane index (0-7):\n");
    scanf("%d %d %d", &x, &y, &z);

    if (z < 0 || z > 7) {
        printf("Invalid bitplane index. Please enter a value between 0 and 7.\n");
        return 1;
    }

    int a[x][y];

    printf("Enter intensity values for the image:\n");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    printf("Bitplane %d of the image:\n", z);
    bitplane(x, y, z, a);

    return 0;
}
