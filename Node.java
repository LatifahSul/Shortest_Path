
public class Node<T> 
{
    private T data;       
	private Node<T> next;    
	 
	
	Node(T data, Node<T> next){
		this.data = data;  
		this.next = next;
		
		}
        
        Node(T data){
		this.data = data;  
		this.next = null;
		
		}
	Node(Node<T> next) { 
		this.next = next; 
		}
	Node<T> getNext() { 
		return next; 
		}  
	Node<T> setNext(Node<T> next){ 
		return this.next = next; 
		}    	
	
	T getData() { 
		return data; }  
	
	T setData(T data) { 
		return this.data = data; }
	
}

    

