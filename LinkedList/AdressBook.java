package adressBook;

//NAME : Muhammad Ahsan Shakeel
//ID: F2019266074 (V5)  
//package linkedlisttasks;

import java.io.*;
import java.io.BufferedInputStream;
import java.io.File;
//import java.util.list;


import java.util.LinkedList;
import java.util.Scanner;

import java.util.ArrayList;
import javax.swing.*;
import java.util.Comparator;

/**
*
* @author Ahsan Shakeel
*/ 
//public class LinkedListTasks 
//{
   


class PersonInfo
{  
 String name;
 String address;
String  number;   

public PersonInfo(String name, String address, String number)
{
          this.name = name;
          this.address = address;
          this.number = number;
    
//System.out.println("Name :: "+name + "Adress :: " + adress+ "Phone Number :: " + number);

    
          
}


void print()
{
	JOptionPane.showMessageDialog(null, " Name     :  " + name + "\n Address  :  " + address+ "\n Number :  " + number );
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}



}








  class AddressBookDoublyLinkedList
  {  
	  
         DoublyLinkedList<PersonInfo> Persons;
	public AddressBookDoublyLinkedList()
	{
		Persons = new DoublyLinkedList<PersonInfo>();
		loadPersons();
	}
	
	
	public void loadPersons()
	{
		String name, add, ph;
		try {
		FileReader fr = new FileReader("C:\\Users\\Ahsan Shakeel\\Desktop\\Persons.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while ( line != null ) {
			String []tokens = line.split(",");
			name = tokens[0];
			add = tokens[1];
			ph = tokens[2];
			PersonInfo p = new PersonInfo(name, add, ph);
			Persons.add(p);

			line = br.readLine();
		}
		br.close();
		fr.close();
		}catch(IOException ioEx){
		System.out.println(ioEx);
		}
		}
	
	
	//ArrayList Persons = new ArrayList();
	
	public void savePersons ( ){
		int size = Persons.size();
		
		try {
		PersonInfo p;
		String insert;
		
		//Collections.sort(p.name);
		FileWriter file = new FileWriter("C:\\Users\\Ahsan Shakeel\\Desktop\\Persons.txt");
		BufferedWriter bw = new BufferedWriter(file);


		for(int i=0; i<size; i++)
		{
		p = (PersonInfo)Persons.dataNode(i);
		
		
		insert = p.name +","+ p.address +","+ p.number+"\n";
		// writes line to file (persons.txt)
		bw.write(insert);
		}

		bw.close();
		file.close();
		}catch(IOException ioEx){
		System.out.println(ioEx);
		
		}
		}
	
	
	
//	ArrayList Persons;
	
	//public AddressBookArrayList() 
	//{
	//	ArrayList Persons;
		// Persons = new ArrayList();
		
		// ArrayList<AddressBookArrayList> Persons = arrayList.OfType<AddressBookArrayList>().ToList();
		 
	//	 loadPersons();
	//}
	//loadpersons();
	
	
/*public class ArrayList<T>
{
//	private T [] PerosnInfo;
	private T Persons;
//	private T second;
//	private T third;
	
public ArrayList()
{
	
	Persons = null;
	//second = null;
	//third = null;
	//T PersonInfo = (T)(new Object());
    //PersonInfo = (T[])(new Object[10]);

}
public void setPerosn(T newPersons)
{
	 Persons = newPersons;
}

public T getPerson()
{
	return Persons;
}
public String toString()
{
	return Persons.toString();
}
}
	*/
	
	
	public  void addPerson()
	{

		String name = JOptionPane.showInputDialog(" Enter Name");
		String adresss = JOptionPane.showInputDialog("\nEnter Address ");
		String num = JOptionPane.showInputDialog("\nEnter Phone Number ");
			
		PersonInfo send = new PersonInfo (name,adresss,num);
		//send.print()
		
		Persons.insertAtEnd(send);    
		
	}
	
	
	
	
	
	
	
	public void searchPerson(String name1)
	{
		//PersonInfo match = new PersonInfo;
		//for(int i = 0; i<Persons.size(); i++)
		// if(name == send)
		int size = Persons.size();
		
		int i =0;
		//while (i<Persons.size())
		PersonInfo obj;
		int j=0, k=1;
		//for(int i = 0; i<Persons.size(); i++)
			while (i<size)
		{
			  obj = (PersonInfo)Persons.dataNode(i);

			//PersonInfo obj;
			//obj = obj3;
			 if (name1.equals(obj.name))
			{
				 Persons.dataNode(i).print();
					//JOptionPane.showMessageDialog(null, "Deleted Successfully!");
			j=k;
					break;
			}
			 i++;
			
		}	 
			 
	if(j!=k)
	{
		JOptionPane.showMessageDialog(null,"Record Not Found !");
	}
			
			
			//	else
			//{
			//	JOptionPane.showMessageDialog(null,"Record Not Found !");
				//break;
				
		//	}
			 
		}
		
/*		for(int i = 0; i<Persons.size(); i++)
		{
			PersonInfo obj = (PersonInfo)Persons.get(i);
	 if (name1!=obj.name)
		{
			JOptionPane.showMessageDialog(null, "Data Not Found!");
	        break;
		}
	}
	
	public void ifMatched(String name)
	{
		boolean match = false;
		int i=0;
		while (i<Persons.size())
			
		{
			Persons.dataNode(i).getName();

			
			 if (name.equals(Persons.dataNode(i).getName()))
			{
							
					match = true;
					
			}
		
	if (match==true)
	{
		String s = Persons.dataNode(i).getName();
	break;
	}
		
		}
	}
	
	*/
	public void deletePerson(String name)
	{
		PersonInfo obj, ob2;
		
			int i =0;
		int size = Persons.size();
		int j =0, k =1;
		while (i<size)
			
			{
				//Persons.dataNode(i).getName();
				// obj = (PersonInfo)Persons.dataNode(i);
				 obj = (PersonInfo)Persons.dataNode(i);
				
				 if(name.equals(obj.name))
				 {
					 //Persons.delete(Persons.dataNode(i));
			
					ob2=	(PersonInfo)Persons.dataNode(i);
					
			         Persons.remove(ob2);

			         JOptionPane.showMessageDialog(null, "Deleted Successfully!");
					j=k;
					savePersons();
						break;
						
				 }

				 i++;
			}
				 
				//break;
				
			//default:
				if(j!=k)
				 {
				
					JOptionPane.showMessageDialog(null, "Data Not Found!");
				}		
					
  }		
				//	break;
				//}
				//else if (obj.name==null || name!=obj.name)
				//{
					//JOptionPane.showMessageDialog(null, "Data Not Found!");
			        //break;
			//	}
				//if (obj.name==null)
				//{

					
				//}
			
			
			
	
	







	

	
  }

/*class Test{	
	public static void main (String[] args)
	{
	
	//ArrayList<String> Persons = new ArrayList();
	//	String f = "Ahsan";
	//	String s = "Umer";
	//String t = "01234";
		//PersonInfo x = new PersonInfo (f,s,t);
		
	//	x.print();
		
	//AdressBookArrayList x = new AdressBookArrayList;	
	//	addPerson();
		

	AddressBookArrayList arrayList = new AddressBookArrayList();
	String data, casee, n;
	boolean exit = false;
	do {
	casee = JOptionPane.showInputDialog(" Enter A to Add Record" + "\n Enter S to Search Record" + "\n Enter D to Delete Record" + "\n Enter E to exit");
	
	
	switch(casee)
	{
	
	case "A" :
		arrayList.addPerson();
		break;
	case "S":
		//arrayList.searchPerson(name);
		data = JOptionPane.showInputDialog("Enter Name of the Person to search");
				arrayList.searchPerson(data);
		break;
	
	case "D" :
	   n = JOptionPane.showInputDialog("Enter the Name you want to delete");
	        arrayList.deletePerson(n);
           break;
	case "E" :
		arrayList.savePersons();
		exit = true;
		break;
	default :
		JOptionPane.showMessageDialog(null,"Invalid Input. Try Again! ","Error", JOptionPane.WARNING_MESSAGE);
	
	}
	
	
	}while(!exit);
}
}
*/