class Stack:
    def __init__(self, maxsize):
        self.stack = []
        self.maxsize = maxsize

    def push(self, item):
        if self.is_full():
            print("The stack is full")
        else:
            self.stack.append(item)

    def pop(self):
        if self.is_empty():
            raise IndexError("Pop from an empty stack")
        return self.stack.pop()

    def peek(self):
        if self.is_empty():
            raise IndexError("Peek from an empty stack")
        return self.stack[-1]

    def is_empty(self):
        return len(self.stack) == 0

    def is_full(self):
        return len(self.stack) == self.maxsize

    def size(self):
        return len(self.stack)

s = Stack(3)

s.push(5)
s.push(6)
s.push(7)
s.push(8)

print("Top element is:", s.peek())
print("Popped element is:", s.pop())
print("Is stack empty?", s.is_empty())
print("Current size of the stack:", s.size())
