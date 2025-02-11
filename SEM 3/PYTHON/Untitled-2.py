class Point:
    def __init__(self, x, y):
        self.x = x  
        self.y = y 
        
    def __eq__(self, other):
        if isinstance(other, Point):
            return self.x == other.x and self.y == other.y
        return False
        
class Line:
    def __init__(self, start: Point, end: Point):
        self.start = start
        self.end = end

    def __add__(self, other):
         if isinstance(other, Line):
            new_start = self.end
            new_end = other.start
            return Line(new_start, new_end)

p1 = Point(2,5)
p2 = Point(3,6)
print(p1)  # Output: (2, 3)  
print(p2)  # Output: (5, 7)  

# Check equality  
print(p1 == p2)  # Output: False  

# Create line segments  
line1 = Line(p1, p2)  
    
# Print line  
print(line1)  # Output: Line: (2, 3) to (5, 7)  

# Create another point and line  
p3 = Point(1, 1)  
line2 = Line(p3, p1)  

# Concatenate lines  
line_concatenated = line1.add(line2)  
print(line_concatenated)