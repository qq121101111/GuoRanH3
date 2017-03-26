public class Main {
public static void main(String[] args){

    DoublyLinkedList dll = new DoublyLinkedList();
     
      Node node = new Node("B");
      Node node2 = new Node("A");
      Node node3 = new Node("C");
      Node node4 = new Node("E");
    
     //insert Nodes
     dll.insert(node);
     dll.insert(node2);
     dll.insert(node3);
     dll.insert(node4);

     
     //prints the size of the doubly link list
    
     dll.traverseForwards();
     
     System.out.println("................................");
       
     dll.traverseBackwards();

    
    

}
}