class MathOperations:
    def add (self, a, b=None, c = None):
        if b is not None and c is not None:
            return a + b + c
        elif b is not None:
            return a + b
        else:
            return a

math_obj = MathOperations()

result1 = math_obj.add(1)
result2 = math_obj.add(1,2)
result3 = math_obj.add(1,2,3)

print(result1)
print(result2)
print(result3)
