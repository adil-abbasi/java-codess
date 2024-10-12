public class QueueLinkedList {
    private static Node rear=null, front=null;
    public static void enqueue(int x){
        Node newNode=new Node(x);
        if(front==null){
            rear=front=newNode;
        }else {
            rear.next=newNode;
            rear=newNode;
        }}
    public static int dequeue(){
        if(front==null){
           return 0;
        }else {
            int num=front.data;
            front=front.next;
            return num;
        } }
    public static int Peak(){
        return front.data;
    }
    public static boolean isEmpty(){
        return front==null;
    }
    public static void main(String args[]){

        enqueue(5);
        enqueue(10);
        enqueue(30);
        System.out.println("Dequeue is :"+dequeue());
        System.out.println("Peak Element is :"+Peak());
        System.out.println("Peak Element is :"+Peak());
        System.out.println("Dequeue is :"+dequeue());
        System.out.println("Dequeue is :"+dequeue());
        System.out.println("Queue is Empty :"+isEmpty());
        enqueue(12);
        enqueue(15);
        System.out.println("Dequeue is :"+dequeue());
        System.out.println("Queue is Empty :"+isEmpty());

}}
