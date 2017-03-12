public class DoublyLinkedList {
    
    private Node head;
    private int size;
    

    public DoublyLinkedList(){
         head = null;
         size = 0;
     }
    public void traverseForwards(String data){
        if(head == null)
          head = new Node(null, data, null);
        else {
          Node newNode = new Node(null, data, head); 
          head.previous = newNode;
          head = newNode;
        }
        
        size++;
    }

     public void traverseBackwards(String data) {
        if(head == null)
          head = new Node(null, data, null);
        else{
          Node current = head;
          while(current.next != null){
              current = current.next;
          }
          Node newNode = new Node(current, data, null);
          current.next = newNode;
        }
          size++;
        }
    
    
   
     public void print(){
        Node current = head;
        while(current != null) {
           System.out.println(current.Data());
           current = current.next;
        }
    }
    public boolean isEmpty() {
        return head == null;    
    
    }
    

    
}
       