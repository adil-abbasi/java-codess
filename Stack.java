public class Stack {
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void Push(int x) {
        if (top == capacity) {
            System.out.println("the Stack is Full");

        } else {
            arr[++top] = x;
        }
    }
    public int Pop() {
        if (top == -1) {
            System.out.println("The Stack is Empty");
            return 0;
        } else {
                return arr[top--];
        }
    }
    public int top(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return 0;
        }else {
            return arr[top];
        }
    }
    public int size(){
        return arr.length;
    }
    public Boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public Boolean isFull(){
        if(top==capacity-1){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String args[]){
        Stack obj=new Stack(5);
        obj.Push(1);
        obj.Push(2);
        System.out.println("First Element POP");
        System.out.println(obj.Pop());
        System.out.println("Second Element POP");
        System.out.println(obj.top());
        obj.Push(3);
        System.out.print("Top Element is :");
        System.out.println(obj.top());
        System.out.print("Total Size is :");
        System.out.println(obj.size());
        System.out.print("Function is Empty :");
        System.out.println(obj.isEmpty());
        obj.Push(4);
        obj.Push(3);
        obj.Push(9);
        System.out.print("Function is Full :");
        System.out.println(obj.isFull());
    }}


