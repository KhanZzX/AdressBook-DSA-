package adressBook;

import javax.swing.JOptionPane;



class Test
{
	
	public static void main (String[] args)
	{
	
	//ArrayList<String> Persons = new ArrayListsA();
	//	String f = "Ahsan";
	//	String s = "Umer";
	//String t = "01234";
		//PersonInfo x = new PersonInfo (f,s,t);
		
	//	x.print();
		
	//AdressBookArrayList x = new AdressBookArrayList;	
	//	addPerson();
		

	AddressBookDoublyLinkedList linkedList = new AddressBookDoublyLinkedList();
	String data, casee, n;
	boolean exit = false;
	do {
	casee = JOptionPane.showInputDialog(" Enter A to Add Record" + "\n Enter S to Search Record" + "\n Enter D to Delete Record" + "\n Enter E to exit");
	
	
	switch(casee)
	{
	
	case "A" :
		linkedList.addPerson();
		break;
	case "S":
		//arrayList.searchPerson(name);
		data = JOptionPane.showInputDialog("Enter Name of the Person to search");
				linkedList.searchPerson(data);
		break;
	
	case "D" :
	   n = JOptionPane.showInputDialog("Enter the Name you want to delete");
	        linkedList.deletePerson(n);
           break;
	case "E" :
		linkedList.savePersons();
		exit = true;
		break;
	default :
		JOptionPane.showMessageDialog(null,"Invalid Input. Try Again! ","Error", JOptionPane.WARNING_MESSAGE);
	
	}
	
	
	}while(!exit);
}
}