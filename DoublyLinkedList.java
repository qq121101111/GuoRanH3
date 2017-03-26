public class DoublyLinkedList {
    //properties
    private Node head;
    private int size;
    private Node tail;
    

    public DoublyLinkedList(){
         head = null;
         size = 0;
         tail = null; 
     }
   
    
    //Insert a node in the list in alphabetical order 
    
    public void insert(Node n){
         
      Node temp = null; 
      
      if (head == null){
                Node newNode = new Node(n.getData(),temp,temp);
                head = newNode;
        }
      else {
               
                Node currentNode = head;
                Node previous = null; 
               
                while(currentNode.getNext()!=null && n.getData().compareToIgnoreCase(currentNode.getData())>0){
                   
                    previous = currentNode; 
                    currentNode = currentNode.getNext();
            
                }
                
                if(currentNode.getNext()!=null){
                
                  Node newNode = new Node(n.getData(),temp,currentNode);
                  currentNode.setPrevious(n);

                }
                else {
                  
                 if(n.getData().compareToIgnoreCase(currentNode.getData())<0 && currentNode == head){
                   
                 Node newNode = new Node(n.getData(),temp,currentNode);
                 head = newNode; 
                 currentNode.setNext(temp);
                 currentNode.setPrevious(newNode);
                
                 }
                 else if (n.getData().compareToIgnoreCase(currentNode.getData())<0 && currentNode != head){
                   
                     Node newNode = new Node(n.getData(),previous,currentNode);
                     previous.setNext(newNode);
                     currentNode.setPrevious(newNode);

                 }
                 else {
                   
                     Node newNode = new Node(n.getData(),currentNode,temp);
                     currentNode.setNext(newNode);

                 }
                 
                }
            }
            size++;
    
  
 }
    
    
    //Traverse the list forwards and print
    
    public void traverseForwards(){
      
       Node currentNode = head; 
      
       while(currentNode.getNext()!=null){
         
       System.out.println(currentNode);
       currentNode = currentNode.getNext();
     
       }
     
       System.out.println(currentNode);
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
    
     public void deleteNode(int index){
      if(head == null)
        return;
      if(index < 1 || index > size)
        return;
      
      Node current = head;
      int i = 1;
      while(i < index){
         current = current.next;
         i++;
       }
      if(current.next == null){
          current.previous.next = null;
         
      }
      else if(current.previous == null){
         current = current.next;
         current.previous = null;
         head = current;
      }
      else {
          current.previous.next = current.next;
          current.next.previous = current.previous;
      }
      size--;
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
       