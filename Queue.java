public class Queue{
   private int[] elements;
   private int size;
   
   public Queue(int size){
      elements = new int[size];
   }
   
   public Queue(){
      this(8);
   }
   
   public void enqueue(int v){
      if(size == elements.length){
         int[] a = new int[elements.length];
         for(int i =0;i<elements.length;i++){
            a[i] = elements[i];
         }
      }
      elements[size++] = v;
   }
   
   public int dequeue(){
      int[] a = new int[size-1];
      for(int i =0;i<a.length;i++) a[i] = elements[i];
      
      return elements[size-1];
   }
   public boolean empty(){
      return size==0;
   }
   public int getSize(){
      return size;}
}