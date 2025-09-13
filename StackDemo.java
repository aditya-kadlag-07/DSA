class Stack {
    int top, size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
