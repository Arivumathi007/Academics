class Point:
    def __init__(self,x,y):
        self.x = x
        self.y = y

    def __add__(self,other):
        return Point(self.x + other.x, self.y + other.y)

    def __sub__(self,other):
        return Point(self.x - other.x, self.y - other.y)

    def __mul__(self,other):
        return Point(self.x * other.x, self.y * other.y)
    
    def __truediv__(self,other):
        if other.x != 0 and other.y != 0:
            return Point(self.x/other.x, self.y/other.y)
        else:
            print("Division by 0 is not possible")
            return false

    def display(self):
        print(f"{self.x},{self.y}")

p1 = Point(3,4)
p2 = Point(4,3)
p3 = p1+p2
p3.display()
p4 = p1/p2
p4.display()
