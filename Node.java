public class Node{
      // Properties
      private String data;
      public Node previous;
      public Node next;

      // Constructor
    public Node (String data) {
      
          previous = null;
          this.data = data;
          next = null;
      
         }


    public Node(Node previous, String data, Node next){
      
           this.previous = previous;
           this.data = data;
           this.next = next;       
      
      }



     public String Data() {
      
        return data;

     }
}
     