public class DoubleLinkedList {
    static Node head;
    static Node tail;
    public static void AddBegining(String name){
        Node newNode=new Node(name);
        if(head==null){
            head=newNode;}
        else {
                Node temp=head;
                newNode.next=temp;
                temp.pre=newNode;
                temp=newNode;
        }}
    public static Node AddBegining(String name,Node head){
       Node newNode=new Node(name);
        if(head==null){
            head=newNode;
            return head;
        }else{
            Node temp=head;
            newNode.next=temp;
            temp=newNode;
            temp.pre=newNode;
            return temp;
        }
    }
    public  static void AddEnd(String name){
        Node newNode=new Node(name);
        if(head==null){
            head=newNode;
        }else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.pre=temp;
        }
    }
    public static Node AddEnd(String name,Node head){
        Node newNode=new Node(name);
        if(head==null){
            head=newNode;
            return head;
        }else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.pre=temp;
            return temp;
       }
    }
   public static Node InsertAfterName(String name, Node head,String name1){
        Node newNode=new Node(name1);
        int index=1;
        Node temp=head;
        Node temp1=head;
        while(temp1.next!=null){
            if(temp1.name==name){
                break;
            }
            index++;
            temp1=temp1.next;
        }
        if(temp1.next==null&&temp1.name!=name){
            System.out.println("Name not found");
            return head;
        }
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
   }
    public static Node InsertBeforName(String name, Node head,String name1){
        Node newNode=new Node(name1);
        int index=1;
        Node temp=head;
        Node temp1=head;
        while(temp1.next!=null){
            if(temp1.name==name){
                break;
            }
            index++;
            temp1=temp1.next;
        }
        if(temp1.next==null&&temp1.name!=name){
            System.out.println("Name not found");
            return head;
        }
        for (int i=1;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static void makeCircular(){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.pre=temp;
        Node temp1=head;
    }
public static void PrintAll(Node head1){
 if(head1==null){
     System.out.println("Linked list is empty");
 }else{
     Node temp=head;
     System.out.print("Circular Linked list is ");
     while (temp.next!=head){
         System.out.print(temp.name+" ");
         temp=temp.next;
     }
     System.out.println(temp.name+" ");
     System.out.println();
 }
 if(head==null){
     System.out.print("Linked list is empty ");
 }else {
     System.out.println("Other Linked list is :");
     Node temp1=head1;
     while (temp1!=null){
         System.out.print(temp1.name+" ");
         temp1=temp1.next;
     }
 }
}
    public static void Print(Node head){
        if(head==null){
            System.out.println("DoubleLinkedList is empty :");
        }else {
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.name+" ");
                temp=temp.next;
            }
        }
    }
    public static void Print(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else {
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.name+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String arg[]){
        Node head=null;
        head=AddBegining("Mustafa",head);
        head=AddBegining("Uzair",head);
        head=AddBegining("Mujeeb",head);
        head=AddEnd("Rizwan",head);
        head=AddEnd("Usman",head);
        head=AddEnd("Rehman",head);
        AddBegining("Lila");
        AddBegining("Majnuo");
        AddEnd("Sasui");
        AddEnd("Punho");
        //Print(head);
        System.out.println();
      //  Print();
        head=InsertAfterName("Ali",head,"Umair");
        head=InsertBeforName("MUhammad",head,"Ahmed");
        makeCircular();
        PrintAll(head);
       // Print();
    }
}
