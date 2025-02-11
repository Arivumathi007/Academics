#include <iostream>
using namespace std;
#define MAX 100

class Stack{
    private:
    int top;
    int items[MAX];

    public:
    Stack(){
        top = -1;
    }

    bool isEmpty(){
        return top == -1;
    }

    bool isFull(){
        return top == MAX - 1;
    }

    void push (int value){
        if (isFull()){
            cout << "Stack overflow can't push element" << "\n";
            return;
        }
        items[++top] = value;
        cout << "Element added to stack" << "\n";
    }

    int pop(){
        if(isEmpty()){
            cout << "Stack overflow can't pop element" << "\n";
            return -1;
        }
        return items[top--];
    }

    int peek(){
        if (isEmpty()){
            cout << "Stack is empty" << "\n";
            return -1;
        }
        return items[top];
    }

    void display(){
        if (isEmpty()){
            cout << "Stack is empty" << "\n";
        }
        cout << "Elements of stack: " << "\n";
        for (int i = 0; i <= top; i++){
            cout << items[i] << " ";
        }
    }
};

int main(){
    Stack s;
    s.push(2);
    s.push(3);
    s.push(4);
    s.isFull();
    s.peek();
    s.pop();
    s.display();
    s.isEmpty();

    return 0;
}