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

    //returns to the head
    
       public Node getHead(){
         
          return head;
        }

     //returns to the tail
       
        public Node getTail(){
          
          Node current = head; 
  
          while(current.getNext()!=null){
            
          current=current.getNext();
    
          }
        
          return current;

        }
    
    
    //Traverse the list backwards and print
        
     public void traverseBackwards() {
        
       Node currentNode = getTail();
  
       while(currentNode.getPrevious()!=null){
         
       System.out.println(currentNode);
       currentNode = currentNode.getPrevious();
       
       }
          System.out.println(currentNode);
       
     }
     
    //Delete a node from the list 
     
    public void deleteNode(Node n){
      
         Node currentNode = head; 
         Node temp = null; 
        
         while(currentNode.getNext()!=null){
   
           if(currentNode.getData().equals(n.getData())){
    
             if(currentNode==head){
     
               head=head.getNext();
   
               head.setPrevious(temp);
     
               return;
    
             }
   
             currentNode.getNext().setPrevious(currentNode.getPrevious());
   
             currentNode.getPrevious().setNext(currentNode.getNext());
    
             size--;
   
             System.out.println("The Node has been deleted");
   
             return;
  
           }
   
           currentNode = currentNode.getNext();
  
         }
  
         System.out.println("Can not find the Node");
  
    }
    
    //Destroy the list 
    
     public void deleteList(){
  
       Node currentNode = head; 
 
       Node tail = getTail();
 
       head = null;
  
       tail = null; 
  
       System.out.print("The entire list has been deleted");
 
       size=0; 
    
    
     }
     
      //A mehtod to Find a node that matches a String
       public boolean findNode(Node n){
  
         Node currentNode = head; 
 
         while(currentNode.getNext()!=null){
   
           if(currentNode.getData().equals(n.getData())){
   
             return true; 
   
           }
   
           currentNode = currentNode.getNext();
 
         }
  
         return false; 
 
       }
    
     //return size
     public int getSize(){
 
       return size; 
    
     }
    
}
       