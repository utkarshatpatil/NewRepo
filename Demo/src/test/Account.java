package test;

public class Account {

	private int ano;
	private String name;
	private double balance;
	
	Account()
	{
		ano = 101;
		name = "Tara";
		balance = 10000;
	}
	
	Account(int no,String nm,double bal)
	{
		ano = no;
		name = nm;
		balance = bal;
	}
	
	public String toString()
	{
		return "Details=\nAccountNo:"+ano+"  Name:"+name+"  Balance"+balance;
	}
//	public void printAccdetails()
//	{ 
//		System.out.println("Account no:"+ano);
//		System.out.println("Name:"+name);
//		System.out.println("Balance:"+balance);
//	}
	public static void main(String[] args) {
		Account a1 = new Account();
		//a1.printAccdetails();
		System.out.println(a1);
		Account a2 = new Account(102, "Utkarsha", 50000);
		//a2.printAccdetails();
		System.out.println(a2);
	}
}
