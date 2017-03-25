public class Main {
public static void main(String[] args){

    DoublyLinkedList dll = new DoublyLinkedList();
     
    dll.traverseForwards("G");
    dll.traverseForwards("F");
    dll.traverseForwards("E");
    dll.traverseForwards("D");
    dll.traverseForwards("C");
    dll.traverseForwards("B");
    dll.traverseForwards("A");
    dll.print();
     System.out.println(".............................");
  /*  dll.traverseBackwards("G");
    dll.traverseBackwards("F");
    dll.traverseBackwards("E");
    dll.traverseBackwards("D");
    dll.traverseBackwards("C");
    dll.traverseBackwards("B");
    dll.traverseBackwards("A");
    dll.print();  */
    
    
    
    dll.deleteNode(1);
    
    dll.print();

}
}