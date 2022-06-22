import java.util.Scanner;

/**
 * 
 * @author peter seboyeng
 *
 */

class Main {
	
	private static final short staffPin = 5050;
	
	public static void main(String[] args) {
		
		systemBoot();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter staff pin:");
		short pin = sc.nextShort();
		
		boolean pinMatch = pin == staffPin;
			
		byte triesLeft = 3;
		
		while(!pinMatch) {
			System.out.println("Invalid pin. Retry. " + triesLeft + " tries left");
			triesLeft--;
			short retryPin = sc.nextShort();
			pinMatch = retryPin == staffPin;
			
			if(triesLeft == 0) {
				System.out.print("Account blocked 🙆‍♀️");
				break;
			}
		}
		
		BankAccount client1 = new BankAccount();
		
		if(pinMatch) {
		    System.out.println("You are logged in 🏃‍♂️");
		    
		    Scanner client = new Scanner(System.in);
		    
			//Open a new account for a new client named John.
		    System.out.print("Enter first name of client : ");
		    String fName = client.nextLine();
		    
		    System.out.print("Enter surname of client : ");
		    String lName = client.nextLine();
		    
		    System.out.print("Enter age of client : ");
		    int age = client.nextByte();
		    
		    client1 = new BankAccount(fName,lName,age);
		    
		    System.out.println("New Account opened 👌🏻 : " + client1); 
		    
		    //Client can make transactions on the new account.
		    System.out.println("Welcome to your new account " + client1.getName() + " " + client1.getSurname());
		    
		    System.out.println("Enter the amount you want to deposit : ");
		    double depositAmount = client.nextDouble();
		    
		    //deposit amount.
		    client1.depositFunds(age);
		    //withdraw amount.
		    
		    System.out.println("Enter withdrawal amount : ");
		    double withdrawAmount = client.nextDouble();
		    client1.withdraw(withdrawAmount);
		}
		
	}
	
	public static void systemBoot() {
		
		drawPyramid();
		
		flipPramidVertically();
		
		System.out.println("  Welcome to BozzaBank  😃");
		
		drawPyramid();
		
		flipPramidVertically();
	}

	private static void flipPramidVertically() {
		//flip the Pyramid vertically.
		for(int i=5; i>=0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	private static void drawPyramid() {
		//Draw a broader base Pyramid with a for loop.
		for(int i=0; i<=5;i++) {
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}

