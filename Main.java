public class Main {
public static void main(String[] args){

    DoublyLinkedList dll = new DoublyLinkedList();
     
      Node node = new Node("B");
      Node node2 = new Node("A");
      Node node3 = new Node("C");
      Node node4 = new Node("D");

     //insert Nodes
     dll.insert(node);
     dll.insert(node2);
     dll.insert(node3);
     dll.insert(node4);

     
    //traverseForwards
    
     dll.traverseForwards();
     
     System.out.println("................................");
    
    //traverseBackwards
     
     dll.traverseBackwards();
     
    System.out.println("................................");
     //Delete a node from the list 
     dll.deleteNode(node3);
     dll.deleteNode(node);
     dll.traverseForwards();
     System.out.println();
     System.out.println(" size: " + dll.getSize());
     
     //Destroy the list
     dll.deleteList();
     System.out.println();
     System.out.println(" size: " + dll.getSize());
    
    System.out.println("................................");
    
   
    
    
       

    
    


     }
}