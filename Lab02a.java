package Lab_02;

interface List{
        boolean isEmpty();
        int size();
        void add(int item);
        void add(int index, linkedList.Node item);
        void remove(int index);
        void remove(linkedList.Node item);
        linkedList duplicate();
        linkedList duplicateReversed();}

    class linkedList implements List {
        Node head;int size;
        linkedList(){
            size = 0;}
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;}}

        public boolean isEmpty(){
            if(head == null){
                return true;}
            return false;}

        public void add(int item){
            size++;
            Node newNode = new Node(item);
            if(head == null){
                head = newNode;
            }else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;}}

        public void add(int index, Node item){
            if(index<=size+1){
                if(index == 1){
                    item.next = head;
                    head = item;
                }else{
                    Node temp = head;
                    for(int i=1; i<index-1; i++){
                        temp = temp.next;
                    }
                    item.next = temp.next;
                    temp.next = item;}}}

        public void remove(int index){
            if(index == 1 && head != null){
                head = head.next;
            }else{
                Node temp = head;
                for(int i=1; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;}}

        public linkedList duplicate(){
            linkedList dupList = new linkedList();
            Node temp = head;
            while(temp != null){
                Node newNode = new Node(temp.data);
                if(dupList.head == null){
                    dupList.head = newNode;
                    temp = temp.next;
                }else{
                    Node dupTemp = dupList.head;
                    while(dupTemp.next != null){
                        dupTemp = dupTemp.next;}
                    dupTemp.next = newNode;
                    temp = temp.next;}}
            return dupList;}

        public linkedList duplicateReversed(){
            linkedList dupReverse = new linkedList();
            for(int i=0; i<=size; i++){
                Node temp = head;
                for(int j=i; j<size; j++){
                    temp = temp.next;}
                Node newNode = new Node(temp.data);
                if(dupReverse.head == null){
                    dupReverse.head = newNode;
                }else{
                    Node dupTemp = dupReverse.head;
                    while(dupTemp.next != null){
                        dupTemp = dupTemp.next;}
                    dupTemp.next = newNode;}}
            return dupReverse;}

        public String toString() {
            System.out.println("Size : " + size() );
            System.out.print(" - ");
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " , ");
                temp = temp.next;}
            return "";}

        public void remove(Node item){
            Node temp = head;
            Node preTemp = null;
            while(temp != null){
                if(item.data == temp.data){
                    preTemp.next = temp.next;
                    break;
                }else{
                    preTemp = temp;
                    temp = temp.next;}}}

        public int size()// checked working Good
        {int size =0;
            Node temp = head;
            while(temp != null){
                size++;
                temp = temp.next;
            }
            return size;}}

    public class Lab02a{
        public static void main(String args[]){
            linkedList list = new linkedList();
            linkedList.Node n = list.new Node(8);

            list.add(1);
            list.add(3);
            list.add(5);
            list.add(4,n);

            linkedList dupList = list.duplicate();
            linkedList ReversedupList = list.duplicateReversed();

            System.out.print("Original List ");
            System.out.println(list+"\n");
            System.out.print("Duplicate List ");
            System.out.println(dupList+"\n");
            System.out.print("Reversed List ");
            System.out.println(ReversedupList+"\n");

            System.out.println("After removing n node from original list: ");
            list.remove(n);
            System.out.println(list);

        }
    }




