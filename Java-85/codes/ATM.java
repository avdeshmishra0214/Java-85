import java.util.Scanner;
class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Bank bank=null;

		System.out.print("which bank's card[1.SBI |2. ICICI]: ");
		int bankType = sc.nextInt();

		switch(bankType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("$--- INVALID CREDIT/DEBIT CARD ---$");
				return;
		}//switch

		System.out.println("---------------------------------------------");
		System.out.println("\t\t WELCOME TO "+ bank.getClass().getSimpleName().toUpperCase());
		System.out.println("---------------------------------------------");
		bank.deposit(1000);
		bank.withdraw(500);
		System.out.println("---------------------------------------------");

		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		System.out.println(bank.n);
		
		//bank.n = 20; //error: cannot assign a value to final variable n
		bank.gstCalculation();
	}
}
