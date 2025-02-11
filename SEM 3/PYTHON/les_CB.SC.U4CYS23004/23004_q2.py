class Point:  
    def __init__(self, x, y):  
        self.x = x  
        self.y = y  

    def __str__(self):  
        return f"({self.x}, {self.y})"  

    def __eq__(self, other):  
        if isinstance(other, Point):  
            return self.x == other.x and self.y == other.y  
        return False  


class Line:  
    def __init__(self, start: Point, end: Point):  
        self.start = start  
        self.end = end  

    def __str__(self):  
        return f"Line: ({self.start.x}, {self.start.y}) to ({self.end.x}, {self.end.y})"  

    def add(self, other):  
        if isinstance(other, Line):  
            new_start = self.end    
            new_end = other.start  
            return Line(new_start, new_end)  


if __name__ == "__main__":  
    p1 = Point(1, 2)  
    p2 = Point(3, 4)  
    
    print(p1)   
    print(p2)    

    print(p1 == p2)    

    line1 = Line(p1, p2)  
    
    print(line1)    

    p3 = Point(1, 1)  
    line2 = Line(p3, p2)  

    line_concatenated = line1.add(line2)  
    print(line_concatenated)