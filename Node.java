public class Node{
      // Properties
      private String data;
      private Node previous;
      private Node next;

      // Constructor
   public Node(){
     
        data = "";
        
         }
   
    public Node (String data) {
      
          
          this.data = data;
         
      
         }


    public Node(String data, Node previous, Node next){
      
           this.previous = previous;
           this.data = data;
           this.next = next;       
      
      }
     //setter and getter
    public String getData(){
   
            return data; 

       }

     public Node getNext(){
       
            return next; 
   
       }
  
      public Node getPrevious(){
 
             return previous; 
  
       }

      public void setData(String n){
 
             data = n; 
       
        }
        //set a Node parameter 
      public void setNext(Node n){
  
             this.next=n; 
 
        }
         
      public void setPrevious(Node n){
 
             this.previous=n;

         }

          //the toString
      public String toString(){
  
             return this.getData();

         }

     
}
     