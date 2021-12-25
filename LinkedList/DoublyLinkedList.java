package adressBook;

class DoublyLinkedList<T>
{
   
private Node<T> head ;
private Node<T> tail ;
static int size=0;
public DoublyLinkedList()
{
 head = null;
 tail = null;

    
}
   
   
static class Node <T>
{
  private T data;
  private Node next;
  private Node previous;
  
   Node (T data)
   {
       this.data = data;
       size++;
   }
		public T data()
		{
			return data;
		}

	    public void setData(T data) {
	        this.data = data;
	    }
		
		public Node<T> getNext()
		{
			return next;
		}


		public void setNext(Node<T> next)
		{
			this.next = next;
		}

               public Node<T> getPrevious()
               {
                   return previous;
               }
               public void setPrevious(Node<T> previous)
               {
                   this.previous = previous;
               }

}







public void insertAtEnd(T data)
{
       
       Node insertNode = new Node(data);  
 
   
       if(head == null) 
       {  
          head = insertNode;
          tail = insertNode;
          head.previous = null;  
          tail.next = null;  
       } 
       else
       {  
           
           tail.next = insertNode;    
           insertNode.previous = tail;  
           tail = insertNode;  
           tail.next = null;  
       } 


} 



public void add(T data) 
{
  Node newN = new Node(data); 
  if(head==null) 
  {
    head=newN;
    tail=newN;
  }
  else 
  {
    newN.previous = (tail);
    tail.next = newN;
    tail=newN;
  }
}






public void removeStart()
	{
           
            Node current = head;
		
           if(head == null)
            {
                System.out.println("Error, List is empty");
            }

		head = head.getNext(); //head to  next element
	        current.next=(null);
               size--;
   
	
       }


public void removeEnd()
{
    Node temp = head; 
       
                       while (temp.next.next != null) 
                       
                           temp = temp.next; 
                       temp.next = null;    
                       size--;
                       
                       }




   /*void remove( Node p) 
   { 
       p.previous.next = p.next;
       p.next.previous = p.previous;
       size--;
   }
*/

   public void removeNode(Node p)
   {
     Node previous = p.previous;
     Node next = p.next;

     if(previous == null && next == null) // if empty
     {
       head=null;
       tail=null;
       size--;
     }
     else if(previous==null)  
     {
       head=next;
       head.previous=null;
       size--;
     }
     else if(next==null)
     {
       tail=previous;
       tail.next=null;
       size--;
     }
     else 
     {
       previous.next=next;
       next.previous=previous;
       size--;
     }
   }



public  T dataNode(int x)
{

 {
       
       if (head == null)
       { 
         //  return;
       }
       if (x<0)
       {
       //    return (T) ;
       }
       
       Node current = head;
       

       for (int i = 0;  i < x; i++)
       {
           current = current.next;
       }
        

     return (T) current.data();
   }
}
 
   



   public int size()
   {  
       System.out.println(size);
              return size;
   }



public void display()
{
Node current = head;
   if(head == null)
   {
       System.out.println("Error, List is empty");
   return;
   }
   while(current!=null)
    {
        System.out.println("List is " + current.data());
    
   current = current.next;
  
    }
}



/*
public T dataNode(int x)
{
	
	 Node curr = head; 
  if(x<0 || x>size)
  {
	  return null;
  }
	 
for(int i = 0; i <x; i++)
{
	curr.next = curr.getPrevious();
	// current.data;
}
return (T) curr.data();
}*/





private Node Searching(T data) 
{
  Node current = head;
  if(current==null) 
  {
   System.out.println("Empty.");
  }
  while(current!=null) 
  {
    if(current.data().equals(data))
    {
      return current;
    }
    current=current.next;
  }
  if(current==null)
  {
	  System.out.println("Data not found.");
  }
  return null; 
}




public void remove(T data) 
{
  Node p = Searching(data); 
  removeNode(p); 
}






/*public void delete(T data)
{
    Node node = head;
    for (int i = 0;i<size;i++)
    {
        if (node.data().equals(data))
        {
            node.previous.setNext(node.next);
            node.next.setPrevious(node.previous);
            size--;
            break;
        }
        node = node.next;
    }
}
*/






}