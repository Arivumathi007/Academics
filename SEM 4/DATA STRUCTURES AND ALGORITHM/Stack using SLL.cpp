#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node(int value) {
        data = value;
        next = nullptr;
    }
};

class Stack {
private:
    Node* top; 

public:
    Stack() {
        top = nullptr;
    }

    void push(int value) {
        Node* newNode = new Node(value);
        newNode->next = top;
        top = newNode;
    }

    void pop() {
        if (!top) {
            cout << "Stack underflow." << endl;
            return;
        }
        Node* temp = top;
        top = top->next;
        delete temp;
    }

    int peek() {
        if (top) {
            return top->data;
        }
        return -1;
    }

    bool isEmpty() {
        return !top;
    }

    void display() {
        Node* current = top;
        while (current) {
            cout << current->data << " ";
            current = current->next;
        }
        cout << endl;
    }
};

int main() {
    Stack s;

    s.push(10);
    s.push(20);
    s.push(30);

    s.display();

    cout << "Top element: " << s.peek() << "\n";

    s.pop();
    s.display();

    s.pop();
    s.pop();
    s.pop();

    return 0;
}