public class DoubleTail {
    public static Node head;
    public static Node tail;
    public void AddBegining(String name){
     Node newNode=new Node(name);
     if(head==null){
         head=tail=newNode;
     }else {
         newNode.next=head;
         head=newNode;
     }
         }

    public void AddEnd(String name){
        Node newNode=new Node(name);
        if(head==null){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void RemoveFront(){
        if (head==null){
            System.out.println("Linked list is empty");
        }else {
            head=head.next;
        }
    }
    public void RemoveLast(){
        if(head==null){
            System.out.println("linked list empty");
        }else
        {
            Node temp=head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
}}
public void Print(){
    if(head==null){
        System.out.println("The Linked list is empty");
    }else{
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.name+" ");
            temp=temp.next;
        }
    }
}
public static void main(String args[]){
        DoubleTail DT=new DoubleTail();
        DT.AddBegining("Mustafa");
        DT.AddBegining("Uzair");
        DT.AddEnd("Rehman");
        DT.AddEnd("Mujeeb");
        DT.RemoveFront();
        DT.RemoveLast();
        DT.Print();
}

}