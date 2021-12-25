
public class ArrayList<T> {


	private static int SIZE = 10;
	private T[] arr;
	private int size;

	public ArrayList()
	{
	    this.arr = (T[]) new Object [SIZE];
	    this.size = 0;
	}
	void add(T data)
	{
	   if (isFull()==false)
	   {
		   arr[size] = data;
		   size++;
	   }
	   else if (isFull()==true)
	   {
		   SIZE = SIZE+SIZE;
		   Object newarr[] = new Object[SIZE];
           for(int i = 0;i<size;i++)
               newarr[i] = arr[i];
           newarr=arr;
	   }
	   	   
	   

	}

	void insertAtIndex(T data, int i)
	{
	    if(i < size || i> size)
	    {
	        System.out.println("Incorrect Index. Try again!");
	    }
	 else
	        arr[i]= data;
	size++;

	}
	
	
	
	void removefromEnd()
	{
	    if(size!=0)
	    {
	       size--;
	        
	    }
	else
	         System.out.println("Size is already 0.");

	}

	
	void remove2(T data)
	{
		for(int i =0; i<size; i++)
		{
			if(arr[i]==data)
			{
				//for(int j =0; j<size; j++)
					for(int j =i; j<size -1; j++)
				{
			           arr[i]=arr[j +1];  
			           size--;
				}
		     }
	}
	}
	
	
	void removeAtIndex(int i)
	{
	if(i<size || i>size)
	{
	  for(int j = i; j<size; j++)
	  {
	      arr[j]= arr[j+1];
	  }
	  size--;
	}
	else
	    System.out.println("Invalid Index");

	}



	int find( T data)
	{ int current;
	    for (int i = 1; i<size; i++)
	    {
	        if(arr[i]==data)
	             System.out.println("Data Found");
	  current = i;
	    return current;
	    }
	return 0;
	}
	int length()
	{
	    return size;
	}

	void isEmpty()
	{
	    if(size==0)
	        System.out.println("List is Empty!");
	else
	       System.out.println("List is not Empty!");
	}
	
	
	
	public boolean isFull()
    {
        if (length() == SIZE)
        {
        	return true;
        }
        else
        	return false;
    }


	void display()
	{
	    for(int i = 0; i <size; i++)
	    {
	        System.out.print(arr[i]+ "->");
	    }
	}
	
public T get(int x)
{
	
		return (T) arr[x];
}


}



