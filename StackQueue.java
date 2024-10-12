public class StackQueue {
    private QueueLinkedList Q1,Q2;
    static int size=0,num=1;
    StackQueue(){
        Q1=new QueueLinkedList();
        Q2=new QueueLinkedList();
    }
    public void Push(int x){
        Q1.enqueue(x);
        size++;
    }
    public int Pop(){
        for(int i=1;i<=size-1;i++){
            Q2.enqueue(Q1.dequeue());
        }
        int k=Q1.dequeue();
        for(int i=1;i<=size-1;i++){
            Q1.enqueue(Q2.dequeue());
        }
        size--;
        return k;
    }
    public static void  main(String args[]){
StackQueue SQ=new StackQueue();
SQ.Push(5);
SQ.Push(10);
SQ.Push(5);
SQ.Push(15);
        System.out.println("Pop Element is :"+SQ.Pop());
        System.out.println("Pop Element is :"+SQ.Pop());
        System.out.println("Pop Element is :"+SQ.Pop());

    }
}
