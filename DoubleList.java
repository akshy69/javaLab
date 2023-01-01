package doublyLinkedList;

class DoublyLinkedList {    
    class Node{  
    	public Node(int item) {  
            this.item = item;  
        }
        int item;  
        Node previous;  
        Node next;  
    }  
    Node head, tail = null;  
    
    public void addNode(int item) {  
        Node newNode = new Node(item);  
        if(head == null) {  
            head = tail = newNode;   
            head.previous = null;    
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;   
            newNode.previous = tail;   
            tail = newNode;  
            tail.next = null;  
        }  
    }  
    void deleteGiven(int item) {
    	Node current =head;
    	while(current.next!=null && item!=current.item) {
    		current=current.next;
    	}
    	if(current.item==item) {
    		Node prev = current.previous;
    		prev.next=current.next;
    		System.out.println("\nitem deleted");
    	}
    }
    public void printNodes() {    
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.print("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
class Main{
    public static void main(String[] args) {  
        DoublyLinkedList ob = new DoublyLinkedList();  
        ob.addNode(10);  
        ob.addNode(20);  
        ob.addNode(30);  
        ob.addNode(40);  
        ob.addNode(50);
        ob.printNodes();  
        
        ob.deleteGiven(40);
        ob.printNodes();  
    }  
}  