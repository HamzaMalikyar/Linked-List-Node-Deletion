public class LinkedList {
    //Head of list
    Node head;
 
    //Node class
    class Node {
        int data;
        Node next;
        Node(int ndata) {
            data = ndata;
            next = null;
        }
    }
 
   //Method to delete the Nth node
   public void deleteNode(int key) {
    	
    	//Pointing to the head of the list
        Node fast = head;
 
        //Pointing to the Nth node
        Node slow = head;
        for (int i = 0; i < key; i++) {
     
        	//If the count of node is less than N
            if (slow.next == null) {
 
                //If the count is equal to N
                if (i == key - 1) {
                    head = head.next;
                return;
                }
            }
            slow = slow.next;
        }
 
        //Increments pointers until slow reaches the end
        while (slow.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
 
        //Deletes Nth node that fast is pointing to
        fast.next = fast.next.next;
    }
 
    //Method to insert a new node in the list
    public void insert(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
 
    //Method to print the linked list
    public void print() {
        Node hnode = head;
        while (hnode != null) {
            System.out.print(hnode.data + " ");
            hnode = hnode.next;
        }
    }
 
    public static void main(String[] args) {
    	//Creating object
        LinkedList list = new LinkedList();
        
        //Inserting nodes in linked list
        list.insert(71);
        list.insert(40);
        list.insert(21);
        list.insert(33);
        list.insert(11);
        list.insert(50);
        
        //Printing given list
        System.out.println("Given list is:");
        list.print();
        
        //Deleting selected node from the end
        int N = 2;
        
        list.deleteNode(N);
 
        //Printing output linked list
        System.out.println("\nLinked list after deletion of N = 2 is:");
        list.print();
    }
}
