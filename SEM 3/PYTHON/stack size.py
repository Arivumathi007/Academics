class Stack:
    def __init__(s, maxsize):
        s.stack = []
        s.maxsize = maxsize

    def push(s, item):
        if s.is_full():
            print("The stack is full")
        else:
            s.stack.append(item)

    def pop(s):
        if s.is_empty():
            raise IndexError("Pop from an empty stack")
        return s.stack.pop()

    def peek(s):
        if s.is_empty():
            raise IndexError("Peek from an empty stack")
        return s.stack[-1]

    def is_empty(s):
        return len(s.stack) == 0

    def is_full(s):
        return len(s.stack) == s.maxsize

    def size(s):
        return len(s.stack)

s = Stack(3)

s.push(5)
s.push(6)
s.push(7)
s.push(8)

print("Top element is:", s.peek())
print("Popped element is:", s.pop())
print("Is stack empty?", s.is_empty())
print("Current size of the stack:", s.size())
