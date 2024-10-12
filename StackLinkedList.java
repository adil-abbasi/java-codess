public class StackLinkedList {
        private  Node head;
    public void push(int x){
            Node newNode=new Node(x);
            if(head==null){
                head=newNode;
            }else {
                newNode.next=head;
                head=newNode;
            }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public int top(){
        if(head==null){
            System.out.println("The StackLinkedlist is empty");
            return 0;
        }else {
            return head.data;
        }
    }
    public int Pop(){
        if(head==null){
            System.out.println("The StackLinkedlist is empty");
            return -1;
        }else {
            int num=head.data;
            head=head.next;
            return num;
        }
    }
    public static void main(String args[]){
        StackLinkedList SLL=new StackLinkedList();
        SLL.push(5);
        SLL.push(10);
        System.out.println("Stack is empty :"+SLL.isEmpty());
        System.out.println("Top Element is :"+SLL.top());
        System.out.println("PoP Element is :"+SLL.Pop());
        System.out.println("Top Element is  :"+SLL.top());
        System.out.println("Stack is empty :"+SLL.isEmpty());
        SLL.push(20);
        System.out.println("Top Element is  :"+SLL.top());
    }
}
