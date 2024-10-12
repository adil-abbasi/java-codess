public class QueueStack {
private StackLinkedList s1,s2;
QueueStack(){
    s1=new StackLinkedList();
    s2=new StackLinkedList();
}
public void enqueue(int data){
    s1.push(data);
}
public void dequeue(){
    if(s2.isEmpty()){
    while (!s1.isEmpty()) {
        s2.push(s1.Pop());
    }  }
    System.out.println("Dequeue Elements :"+s2.Pop());
    if(s1.isEmpty()){
    while (!s2.isEmpty()){
        s1.push(s2.Pop());
    }
    }}
    public static void main(String args[]){
    QueueStack QS=new QueueStack();
    QS.enqueue(5);
    QS.enqueue(10);
    QS.enqueue(15);
    QS.enqueue(20);
    QS.dequeue();
    QS.dequeue();
    }
}
