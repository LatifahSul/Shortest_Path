
public class LinkedQueue<T> 
{
          public Node<T> front;
	public Node<T> rear;
	public int count;
	
	public LinkedQueue(){
		front = null;
		rear = null;
		count = 0; }
	
	public boolean isEmpty(){
		return front == null; }
	
	public void enQueue(T val){
		if (isEmpty())
			front = rear = new Node(val);
		else{
			rear = rear.setNext( new Node(val)) ;
			 }
            count++;  }

	public T deQueue(){
            T t;
		if(isEmpty()) {	
System.out.println("The Queue is empty!!");
                    return null;
                }
		else{
                 t = front.getData();
		    front = front.getNext();
                    count--;
            return t;}
        }
        
        public int size()
        {
            return count;
        }
		//Implement the method peek
           public T peek(){
            T t;
		if(isEmpty())
                {	
                    System.out.println("The Queue is empty!!");
                    return null;
                }
		else{
                 t = front.getData();
            return t;} }
        
        void print(){
            int size = count;
            for(int i=0; i< size ; i++){
                enQueue(peek());
                System.out.print(deQueue()+ "|");
            }
            System.out.println();
        } 
}
