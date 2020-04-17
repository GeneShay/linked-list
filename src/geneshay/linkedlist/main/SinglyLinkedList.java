package geneshay.linkedlist.main;

// Implementation for Singly Linked List
public class SinglyLinkedList<T> {

    // private data to prevent direct user access
    private Node head = null;
    private Node tail = null;

    public SinglyLinkedList() {}

    public void add(T obj){
        Node node = new Node(obj);
        if ( head == null ) {
            head = node;
            tail = node;
        } else if ( tail == null ) {
            Node currentNode = head;
            while ( currentNode.nextNode != null ) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = node;
            tail = node;
        } else {
            tail.nextNode = node;
            tail =  node;
        }
    }

    /**
     * Returns the head of the LinkedList
     * @return <T>
     */
    public T getHead(){
        return (T) this.head.obj;
    }

    /**
     * Returns the tail of the LinkedList
     * @return Node
     */
    public T getTail() {
        return (T) this.tail.obj;
    }

    /**
     *  Reverses Linked List
     */
    public void reverse() {
        if (head == null){ return; }
        Node newTail = head;
        Node currentNode = head;
        Node nextNode = head.nextNode;
        Node previousNode = null;
        // Loop through the linked list reversing the order
        while (nextNode != null) {
            /* move the pointer of the nextNode forward to keep track of
            the next node in the list*/
            nextNode = currentNode.nextNode;
            // reverse the pointer to the previous node
            currentNode.nextNode = previousNode;
            // Move the pointer of the previous node forward
            previousNode = currentNode;
            // Move the pointer of the currnet node forward
            currentNode = nextNode;
        }
        this.head = previousNode;
        this.tail = newTail;
    }

    /**
     * Returns
     * @return
     */
    public String toString(){
        Node pointerNode = this.head;
        String response = "";
        while(pointerNode != null){
            response += " " + pointerNode.obj.toString();
            pointerNode = pointerNode.nextNode;
        }
        return response;
    }

    /**
     * Implementation of the linked list Node
     * @param <T> object to store in the Node
     * @param Node<T> next node
     */
    private class Node<T> {
        // Public values to reduce verboseness with getters and setters
        public T obj = null;
        public Node<T> nextNode = null;

        public Node(T obj) {
            this.obj = obj;
        }

        public String toString() {
            return obj.toString();
        }
    }
}