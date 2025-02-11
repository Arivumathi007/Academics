#include <iostream>
using namespace std;
#define MAX 100

class Queue{
    private:
    int front,rear;
    int items[MAX];
    
    public:
    Queue(){
        front = 0;
        rear = -1;
    }
    
    bool isEmpty(){
        return front > rear;
    }

    bool isFull(){
        return rear == MAX - 1;
    }

    void enqueue(int value){
        if (isFull()){
            cout << "Queue overflow can't enqueue";
            return;
        }
        items[++items] = value;
        cout << value;

    int dequeue(){
        if (isEmpty()){
            cout << "Queue underflow can't dequeue";
            return -1;
        }
        return items[front++];
        }

    int peek(){
        if(isEmpty()){
            cout << "Queue is empty";
            return -1;
        }
        return items[front];
    }
    cout << "Elements of queue";
    }
}