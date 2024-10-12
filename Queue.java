public class Queue {

    private int arr[];
    private int front ;
    private int rear;
    private int capacity;
    Queue(int size){
        arr=new int[size];
        capacity=size;
        front=0;
        rear=0;
    }
    public boolean isEmpty(){
        return rear==0;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty :");
        }else {
                front=arr[0];
                for(int i=0; i<rear; i++){
                    arr[i]=arr[i+1];
                }
                rear=rear-1;
            System.out.println("Dequeue Element for Queue :"+front);
        }
    }
    public void enqueue(int item){
        if(rear==-1){
            System.out.println("Queue is Full :");
        }else {
            arr[rear]=item;
            rear=rear+1;
        }
    }
    public void peek(){
        System.out.println("Peak Element is :"+arr[0]);
    }
    public int Size(){
        return arr.length;
    }
    public boolean isFull(){
        return rear==capacity-1;
    }
    public static void main(String args[]){
        Queue Q=new Queue(5);
        Q.enqueue(5);
        Q.enqueue(2);
        Q.dequeue();
        Q.dequeue();
        Q.enqueue(10);
        Q.peek();
        System.out.println("Size of Queue is :"+Q.Size());
        System.out.println("Queue is Empty :"+Q.isEmpty());
        System.out.println("Queue is Full :"+Q.isFull());
    }
}
