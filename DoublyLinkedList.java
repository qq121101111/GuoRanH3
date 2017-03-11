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

}
       