class Queue:
    def __init__(s,maxsize):
        s.queue=[]
        s.maxsize=maxsize
    def enque(s, item):
        if not s.isfull():
            s.queue.append(item)
        else:
            print("the queue is full")

    def deque(s):
        if s.is_empty():
            raise IndexError("Pop from an empty queue")
        return s.queue.pop(0)

    def front(s):
        if s.is_empty():
            raise IndexError("top of an empty queue")
        return s.queue[0]
    
    def back(s):
        if s.is_empty():
            raise IndexError("top of an empty queue")
        return s.queue[-1]

    def is_empty(s):
        return len(s.queue) == 0

    def size(s):
        return len(s.queue)

    def isfull(s):
        return len(s.queue)==s.maxsize

q=Queue(3)
q.enque(5)
q.enque(6)
q.enque(7)
q.enque(8)
print("the queue being empty is",q.is_empty())
print("size of the queue is",q.size())
print("first element is",q.front())
print("last element is",q.back())
print("removing first element",q.deque())
print("first element is",q.front())
    
    
