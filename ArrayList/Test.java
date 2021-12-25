
import javax.swing.JOptionPane;

class Test
{
	
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