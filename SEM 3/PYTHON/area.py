class Shape:
    def area(self, a, b = None):
        if b is not None:
            return a*b
        else:
            if isinstance(a,int):
                return a**2
            else:
                return 3.14*a*a

obj = Shape() 
print(obj.area(3,4))
print(obj.area(3))
print(obj.area(2.0))
