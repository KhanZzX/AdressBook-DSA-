

//NAME : Muhammad Ahsan Shakeel
//ID: F2019266074 (V5)  
//package linkedlisttasks;

import java.io.*;
import java.io.BufferedInputStream;
import java.io.File;
//import java.util.list;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import javax.swing.*;
import java.util.Collections;
import java.util.Comparator;
/**
*
* @author Ahsan Shakeel
*/ 
//public class LinkedListTasks 
//{
   





class PersonInfo implements Comparable
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




void print()
{
	JOptionPane.showMessageDialog(null, " Name     :  " + name + "\n Address  :  " + address+ "\n Number :  " + number );
}



public static Comparator<PersonInfo> PersonNameCompare = new Comparator<PersonInfo>() {

	public int compare(PersonInfo s1, PersonInfo s2) {
	   String PersonName1 = s1.getName().toUpperCase();
	   String PersonName2 = s2.getName().toUpperCase();

	   return PersonName1.compareTo(PersonName2);

    }};






public String compareTo(PersonInfo o) {
	// TODO Auto-generated method stub
	//return 0;
	
 
	        String comp=((PersonInfo) o).getName();
	        /* For Ascending order*/
	        return this.name ;
}




@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

}


  class AddressBookArrayList {
 
	private ArrayList<PersonInfo> Persons;
	public AddressBookArrayList()
	{
		Persons = new ArrayList <PersonInfo>();
	loadPersons();
	}
	
	
	public void loadPersons()
	{
	String t[] = null;
	String name, add, ph;
		try {
	FileReader fr = new FileReader("C:\\Users\\Ahsan Shakeel\\Desktop\\Persons.txt");
	BufferedReader br = new BufferedReader(fr);
	String dataLine = br.readLine();
		while ( dataLine != null ) 
{
	t = dataLine.split(",");
	name = t[0];
	add = t[1];
	ph = t[2];
	PersonInfo p = new PersonInfo(name, add, ph);
	Persons.add(p);
		
	dataLine = br.readLine();
	}
	br.close();
	fr.close();
	}catch(IOException ioEx){
	System.out.println(ioEx);
	}
	}
	
	
	//ArrayList Persons = new ArrayList();
	
	public void savePersons ( ){

	        		
		
		
		
	try {
	PersonInfo p;
	String line;	
	FileWriter file = new FileWriter("C:\\Users\\Ahsan Shakeel\\Desktop\\Persons.txt");
	PrintWriter pw = new PrintWriter(file);
	for(int i=0; i<Persons.size(); i++)
	{
		p = (PersonInfo)Persons.get(i);	
		line = p.name +","+ p.address +","+ p.number;
		// writes line to file (persons.txt)
		pw.println(line);
	}
	pw.flush();
	pw.close();
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
		//PersonInfo obj1 = new PersonInfo (name, adress, num);
		//String name;
		//String adress;
		//String num;
	
		
		
		/*System.out.println(" Enter Name   ::  ");
        Scanner obj1 = new Scanner(System.in);
        String n1 = obj1.nextLine();
        System.out.println("");
        System.out.println(" Enter Adress :: ");
       // Scanner obj2 = new Scanner(System.in);
       String a1 = obj1.nextLine();
        System.out.println("");
        System.out.println(" Enter Phone Number :: ");
       //Scanner obj3 = new Scanner(System.in);
        String  p = obj1.nextLine();
		*/
		String name = JOptionPane.showInputDialog(" Enter Name");
		String adresss = JOptionPane.showInputDialog("\nEnter Address ");
		String num = JOptionPane.showInputDialog("\nEnter Phone Number ");
		
		
		PersonInfo send = new PersonInfo (name,adresss,num);
		//send.print();
		//Collections.sort((Persons<PersonInfo>);
		Collections.sort(Persons, PersonInfo.PersonNameCompare);
		Persons.add(send);     //ArrayList
		

    }
		
		
		
	
	
	public void searchPerson(String name1)
	{
		//PersonInfo match = new PersonInfo;
		//for(int i = 0; i<Persons.size(); i++)
		// if(name == send)
		
		int i =0;
		//while (i<Persons.size())
		PersonInfo obj;
		int j=0, k=1;
		//for(int i = 0; i<Persons.size(); i++)
			while (i<Persons.size())
		{
			 obj = (PersonInfo)Persons.get(i);

			
			 if (name1.equals(obj.name))
			{
					obj.print();
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
	}*/
	
	
	
	public void deletePerson(String name)
	{
		//PersonInfo obj;
			int i =0;
		//
		int j =0, k =1;
		while (i<Persons.size())
			
			{
					PersonInfo	 obj = (PersonInfo)Persons.get(i);

				
				 if (name.equals(obj.name))
				{
						Persons.remove(i);
						JOptionPane.showMessageDialog(null, "Deleted Successfully!");
				j=k;			
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